/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Elieth
 */
public class Inventario {
    private int ID_prod;
    private String nombre;
    private String marca;
    private String modelo;
    private String descrip;
    private Date garant;
    private int precio;
    private int stock;
    
    public Inventario(int ID_prod, String nombre, String marca, String modelo, String descrip, Date garant, int precio, int stock) {
        this.ID_prod = ID_prod;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descrip = descrip;
        this.garant = garant;
        this.precio = precio;
        this.stock = stock;
    }

    public Inventario(String nombre, String marca, String modelo, String descrip, Date garant, int precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.descrip = descrip;
        this.garant = garant;
        this.precio = precio;
        this.stock = stock;
    }

    public int getID_prod() {
        return ID_prod;
    }

    public void setID_prod(int ID_prod) {
        this.ID_prod = ID_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Date getGarant() {
        return garant;
    }

    public void setGarant(Date garant) {
        this.garant = garant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}