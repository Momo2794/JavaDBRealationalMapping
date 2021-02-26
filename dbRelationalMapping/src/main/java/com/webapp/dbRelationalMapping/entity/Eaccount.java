package com.webapp.dbRelationalMapping.entity;

import javax.persistence.*;

@Entity
@Table(name = "eaccount")
public class Eaccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Long eid;

    @Column(name = "e_email")
    private String eemail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "e_p_id")
    private Person person;

    @OneToOne(mappedBy = "eaccount", cascade = CascadeType.ALL)
    private Shopaccount shopaccount;

    public Eaccount(Long eid, String eemail, Shopaccount shopaccount) {
        this.eid = eid;
        this.eemail = eemail;
        this.shopaccount = shopaccount;
    }

    public Eaccount(){}

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public Shopaccount getShopaccount() {
        return shopaccount;
    }

    public void setShopaccount(Shopaccount shopaccount) {
        this.shopaccount = shopaccount;
    }
}
