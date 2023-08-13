package com.endava.coffeeshop.Legatura_Comanda_Ingrediente;

import javax.persistence.*;

@Entity
@Table(name="TBL_LEGATURA")
public class Legatura_Comanda_Ingrediente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="id")
private Integer id;

    @Column(name ="id_bautura")
    private Integer id_bautura;

    @Column(name ="id_ingrediente")
    private Integer id_ingrediente;



public Legatura_Comanda_Ingrediente() {
        }

public Legatura_Comanda_Ingrediente(Integer id, Integer id_bautura, Integer id_ingrediente) {
        this.id = id;
        this.id_bautura = id_bautura;
        this.id_ingrediente= id_ingrediente;

        }


public Legatura_Comanda_Ingrediente(String nume, Integer pret, Boolean custom) {
    this.id_bautura = id_bautura;
    this.id_ingrediente = id_ingrediente;

}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_bautura() {
        return id_bautura;
    }

    public void setId_bautura(Integer id_bautura) {
        this.id_bautura = id_bautura;
    }

    public Integer getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(Integer id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }

    @Override
    public String toString() {
        return "Legatura_Comanda_Ingrediente{" +
                "id=" + id +
                ", id_bautura=" + id_bautura +
                ", id_ingrediente=" + id_ingrediente +
                '}';
    }
}
