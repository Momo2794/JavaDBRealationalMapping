package com.webapp.dbRelationalMapping.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long pid;

    @Column(name = "p_firstname")
    private String pfirstname;

    @Column(name = "p_lastname")
    private String plastname;

    @Column(name = "p_dob")
    private Date pdob;

    @Column(name = "p_street")
    private String pstreet;

    @Column(name = "p_postcode")
    private String ppostcode;

    @Column(name = "p_country")
    private String pcountry;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Eaccount> eaccount;

    public Person(Long pid,
                  String pfirstname,
                  String plastname,
                  Date pdob,
                  String pstreet,
                  String ppostcode,
                  String pcountry,
                  List<Eaccount> eaccount) {
        this.pid = pid;
        this.pfirstname = pfirstname;
        this.plastname = plastname;
        this.pdob = pdob;
        this.pstreet = pstreet;
        this.ppostcode = ppostcode;
        this.pcountry = pcountry;
        this.eaccount = eaccount;
    }

    public Person(){}

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPfirstname() {
        return pfirstname;
    }

    public void setPfirstname(String pfirstname) {
        this.pfirstname = pfirstname;
    }

    public String getPlastname() {
        return plastname;
    }

    public void setPlastname(String plastname) {
        this.plastname = plastname;
    }

    public Date getPdob() {
        return pdob;
    }

    public void setPdob(Date pdob) {
        this.pdob = pdob;
    }

    public String getPstreet() {
        return pstreet;
    }

    public void setPstreet(String pstreet) {
        this.pstreet = pstreet;
    }

    public String getPpostcode() {
        return ppostcode;
    }

    public void setPpostcode(String ppostcode) {
        this.ppostcode = ppostcode;
    }

    public String getPcountry() {
        return pcountry;
    }

    public void setPcountry(String pcountry) {
        this.pcountry = pcountry;
    }

    public List<Eaccount> getEaccount() {
        return eaccount;
    }

    public void setEaccount(List<Eaccount> eaccount) {
        this.eaccount = eaccount;
    }
}
