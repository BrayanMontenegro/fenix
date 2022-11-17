/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Elieth
 */
public class DAOIventario {

    public Inventario Insertar(String nombre, String marca, String modelo, String decrip, String garant, String Precio, int stock) {

        String transaccion = "INSERT INTO PRODUCTO VALUES('"
                + nombre + "', '"
                + marca + "', '"
                + modelo + "', '"
                + decrip + "', '"
                + garant + "', '"
                + Precio + "', '"
                + stock + "') ";

        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Inventario(nombre, marca, modelo, decrip, garant, Precio, stock);
        }
        return null;
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM PRODUCTO";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Inventario> inventari = new ArrayList();
        for (Map registro : registros) {

            Inventario ive = new Inventario((int) registro.get("ID_prod"),
                    (String) registro.get("nombre"), (String) registro.get("marca"), (String) registro.get("modelo"),
                    (String) registro.get("decrip"), (String) registro.get("garant"),
                    (String) registro.get("Precio"), (int) registro.get("stock"));
            inventari.add(ive);

        }
        return inventari;
    }

}
