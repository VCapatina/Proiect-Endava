package com.endava.coffeeshop.Client;

import javax.persistence.*;

@Entity
@Table(name="TBL_CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name ="name")
    private String name;

    @Column(name ="total_plata")
    private Integer total_plata;

    public Client() {
    }

    public Client(Integer id, String name, Integer total_plata) {
        this.id = id;
        this.name = name;
        this.total_plata = total_plata;
    }


    public Client(String name, Integer total_plata) {
        this.name = name;
        this.total_plata = total_plata;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal_plata() {
        return total_plata;
    }

    public void setTotal_plata(Integer total_plata) {
        this.total_plata = total_plata;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total_plata=" + total_plata +
                '}';
    }
}
