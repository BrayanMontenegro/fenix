/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import javax.swing.JFrame;

/**
 *
 * @author Elieth
 */
public class Inventario {

    private int ID_prod;
    private String nombre;
    private String marca;
    private String modelo;
    private String decrip;
    private String garant;
    private String Precio;
    private int stock;

    public Inventario(int ID_prod, String nombre, String marca, String modelo, String decrip, String garant, String Precio, int stock) {
        this.ID_prod = ID_prod;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.decrip = decrip;
        this.garant = garant;
        this.Precio = Precio;
        this.stock = stock;
    }

    public Inventario(String nombre, String marca, String modelo, String decrip, String garant, String Precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.decrip = decrip;
        this.garant = garant;
        this.Precio = Precio;
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

    public String getDecrip() {
        return decrip;
    }

    public void setDecrip(String decrip) {
        this.decrip = decrip;
    }

    public String getGarant() {
        return garant;
    }

    public void setGarant(String garant) {
        this.garant = garant;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    

}
