package com.webapp.dbRelationalMapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_id")
    private Long iid;

    @Column(name = "i_name")
    private String iname;

    @Column(name = "i_itemnumber")
    private String iitemnumber;

    @Column(name = "i_amount")
    private Double iamount;

    @Column(name = "i_available")
    private Long iavailable;

    @JsonIgnore
    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<Item_Orderlist> item_orderlist;

    public Item(Long iid,
                String iname,
                String iitemnumber,
                Double iamount,
                Long iavailable) {
        this.iid = iid;
        this.iname = iname;
        this.iitemnumber = iitemnumber;
        this.iamount = iamount;
        this.iavailable = iavailable;
    }

    public Item(){}

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIitemnumber() {
        return iitemnumber;
    }

    public void setIitemnumber(String iitemnumber) {
        this.iitemnumber = iitemnumber;
    }

    public Double getIamount() {
        return iamount;
    }

    public void setIamount(Double iamount) {
        this.iamount = iamount;
    }

    public Long getIavailable() {
        return iavailable;
    }

    public void setIavailable(Long iavailable) {
        this.iavailable = iavailable;
    }

    public List<Item_Orderlist> getItem_orderlist() {
        return item_orderlist;
    }

    public void setItem_orderlist(List<Item_Orderlist> item_orderlist) {
        this.item_orderlist = item_orderlist;
    }
}
