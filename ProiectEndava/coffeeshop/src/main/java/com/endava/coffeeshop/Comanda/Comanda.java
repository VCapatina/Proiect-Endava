package com.endava.coffeeshop.Comanda;

import javax.persistence.*;

@Entity
@Table(name="TBL_Comanda")
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_client")
    private Integer id_client;

    @Column(name = "id_bautura")
    private Integer id_bautura;


    public Comanda() {
    }

    public Comanda(Integer id, Integer id_client, Integer id_bautura) {
        this.id = id;
        this.id_client = id_client;
        this.id_bautura = id_bautura;

    }


    public Comanda(Integer id_client, Integer id_bautura) {
        this.id_client = id_client;
        this.id_bautura = id_bautura;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Integer getId_bautura() {
        return id_bautura;
    }

    public void setId_bautura(Integer id_bautura) {
        this.id_bautura = id_bautura;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", id_client=" + id_client +
                ", id_bautura=" + id_bautura +
                '}';
    }
}
