package com.webapp.dbRelationalMapping.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shopaccount")
public class Shopaccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Long sid;

    @Column(name = "s_username")
    private String susername;

    @Column(name = "s_password")
    private String spassword;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "s_e_id", referencedColumnName = "e_id")
    private Eaccount eaccount;

    @OneToMany(mappedBy = "shopaccount", cascade = CascadeType.ALL)
    private List<Purchaseorder> purchaseorder;

    public Shopaccount(Long sid,
                       String susername,
                       String spassword,
                       List<Purchaseorder> purchaseorder) {
        this.sid = sid;
        this.susername = susername;
        this.spassword = spassword;
        this.purchaseorder = purchaseorder;
    }

    public Shopaccount(){}

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public List<Purchaseorder> getPurchaseorder() {
        return purchaseorder;
    }

    public void setPurchaseorder(List<Purchaseorder> purchaseorder) {
        this.purchaseorder = purchaseorder;
    }
}
