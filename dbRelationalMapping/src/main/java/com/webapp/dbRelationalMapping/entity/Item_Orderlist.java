package com.webapp.dbRelationalMapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "item_orderlist")
public class Item_Orderlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "io_id")
    private Long ioid;

    @ManyToOne
    @JoinColumn(name = "io_i_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "io_o_id")
    @JsonIgnore
    private Purchaseorder purchaseorder;

    @Column(name = "io_number")
    private Long ionumber;

    @Column(name = "io_totalamount")
    private Double iototalamount;

    public Item_Orderlist(Long ioid, Item item, Purchaseorder purchaseorder, Long ionumber, Double iototalamount) {
        this.ioid = ioid;
        this.item = item;
        this.purchaseorder = purchaseorder;
        this.ionumber = ionumber;
        this.iototalamount = iototalamount;
    }

    public Item_Orderlist(){}

    public Long getIoid() {
        return ioid;
    }

    public void setIoid(Long ioid) {
        this.ioid = ioid;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Purchaseorder getPurchaseorder() {
        return purchaseorder;
    }

    public void setPurchaseorder(Purchaseorder purchaseorder) {
        this.purchaseorder = purchaseorder;
    }

    public Long getIonumber() {
        return ionumber;
    }

    public void setIonumber(Long ionumber) {
        this.ionumber = ionumber;
    }

    public Double getIototalamount() {
        return iototalamount;
    }

    public void setIototalamount(Double iototalamount) {
        this.iototalamount = iototalamount;
    }
}
