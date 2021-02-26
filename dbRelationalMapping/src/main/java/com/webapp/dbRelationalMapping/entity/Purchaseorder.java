package com.webapp.dbRelationalMapping.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "purchaseorder")
public class Purchaseorder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "po_id")
    private Long poid;

    @Column(name = "po_orderdate")
    private Date poorderdate;

    @Column(name = "po_active")
    private Boolean poactive;

    @Column(name = "po_payed")
    private Boolean popayed;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "po_s_id")
    private Shopaccount shopaccount;

    @OneToMany(mappedBy = "purchaseorder", cascade = CascadeType.ALL)
    private List<Item_Orderlist> item_orderlist;

    public Purchaseorder(Long poid,
                         Date poorderdate,
                         Boolean poactive,
                         Boolean popayed) {
        this.poid = poid;
        this.poorderdate = poorderdate;
        this.poactive = poactive;
        this.popayed = popayed;
    }

    public Purchaseorder(){}

    public Long getPoid() {
        return poid;
    }

    public void setPoid(Long poid) {
        this.poid = poid;
    }

    public Date getPoorderdate() {
        return poorderdate;
    }

    public void setPoorderdate(Date poorderdate) {
        this.poorderdate = poorderdate;
    }

    public Boolean getPoactive() {
        return poactive;
    }

    public void setPoactive(Boolean poactive) {
        this.poactive = poactive;
    }

    public Boolean getPopayed() {
        return popayed;
    }

    public void setPopayed(Boolean popayed) {
        this.popayed = popayed;
    }

    public List<Item_Orderlist> getItem_orderlist() {
        return item_orderlist;
    }

    public void setItem_orderlist(List<Item_Orderlist> item_orderlist) {
        this.item_orderlist = item_orderlist;
    }
}
