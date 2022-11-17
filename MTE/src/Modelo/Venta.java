/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elieth
 */
public class Venta {

    public Venta(int ID_venta, String articulo, String fecha, String precio, int codcli, int ID_empleado) {
        this.ID_venta = ID_venta;
        this.articulo = articulo;
        this.fecha = fecha;
        this.precio = precio;
        this.codcli = codcli;
        this.ID_empleado = ID_empleado;
    }

    public Venta(String articulo, String fecha, String precio, int codcli, int ID_empleado) {
        this.articulo = articulo;
        this.fecha = fecha;
        this.precio = precio;
        this.codcli = codcli;
        this.ID_empleado = ID_empleado;
    }

    public int getID_venta() {
        return ID_venta;
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCodcli() {
        return codcli;
    }

    public void setCodcli(int codcli) {
        this.codcli = codcli;
    }

    public int getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(int ID_empleado) {
        this.ID_empleado = ID_empleado;
    }
    private int ID_venta;
    private String articulo;
    private String fecha;
    private String  precio;
    private int codcli;
    private  int ID_empleado;
}
