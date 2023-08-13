package com.endava.coffeeshop.Bauturi;

import javax.persistence.*;

@Entity
@Table(name="TBL_BAUTURI")
public class Bauturi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="nume")
    private String nume;

    @Column(name ="pret")
    private Integer pret;


    @Column(name ="custom")
    private Boolean custom;

    public Bauturi() {
    }

    public Bauturi(Integer id, String nume, Integer pret, Boolean custom) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.custom = custom;
    }


    public Bauturi(String nume, Integer pret, Boolean custom) {
        this.nume = nume;
        this.pret = pret;
        this.custom = custom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return "Bauturi{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", custom=" + custom +
                '}';
    }
}
