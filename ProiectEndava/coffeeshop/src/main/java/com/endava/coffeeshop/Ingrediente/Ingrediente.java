package com.endava.coffeeshop.Ingrediente;

import javax.persistence.*;

@Entity
@Table(name="TBL_INGREDIENTE")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nume")
    private String nume;

    @Column(name = "pret")
    private Integer pret;


    public Ingrediente() {
    }

    public Ingrediente(Integer id, String nume, Integer pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;

    }


    public Ingrediente(String nume, Integer pret, Boolean custom) {
        this.nume = nume;
        this.pret = pret;

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

    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
