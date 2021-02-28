package com.webapp.dbRelationalMapping.controller;

import com.webapp.dbRelationalMapping.entity.Item;
import com.webapp.dbRelationalMapping.entity.Person;
import com.webapp.dbRelationalMapping.entity.Shopaccount;
import com.webapp.dbRelationalMapping.repository.ItemRepo;
import com.webapp.dbRelationalMapping.repository.PersonRepo;
import com.webapp.dbRelationalMapping.repository.ShopaccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private ShopaccountRepo shopaccountRepo;


    //If u want to see the whole data as JSON
    @RequestMapping(value = "/list-data/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    private List<Person> getAllDataAsJSON() {
        List<Person> listWholeData = personRepo.findAll();
        return listWholeData;
    }

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    private String showHomepage(Model model) {
        List<Item> itemList = itemRepo.findAll();
        model.addAttribute("Items", itemList);
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    private String showAboutPage() {
        return "about";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    private String showContactPage() {
        return "contact";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    private String showLoginPage(@ModelAttribute("shopaccount") Shopaccount shopaccountget) {
        return "login";
    }

    @RequestMapping(value = "/loggedin", method = RequestMethod.POST)
    private String loggedInShopaccount(@ModelAttribute("shopaccount") Shopaccount shopaccount, Model model) {
        Shopaccount checkshopaccount = shopaccountRepo.findBysusername(shopaccount.getSusername());
        String checkpasswordForm = shopaccount.getSpassword();
        String checkpasswordDB = checkshopaccount.getSpassword();

        if (checkshopaccount == null) {
            model.addAttribute("sha", shopaccount);
            return "error";
        } else if (!checkpasswordDB.equals(checkpasswordForm)) {
            model.addAttribute("sha", shopaccount);
            return "error";
        }

        model.addAttribute("sha", shopaccount);
        return "shopaccount";
    }
}
