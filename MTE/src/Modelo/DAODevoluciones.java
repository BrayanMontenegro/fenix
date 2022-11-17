/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author PC-game
 */
public class DAODevoluciones {

    public Devolucion Insertar(String descrip, java.sql.Date fecha, int ID_prod) {
        String transaccion = "INSERT INTO DEVOLUCIONES VALUES('"
                + descrip + "', '"
                + fecha + "', '"
                + ID_prod + "') ";

        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Devolucion(descrip, fecha, ID_prod);
        }
        return null;

    }

    public List ObtenerDatos() {
        String transaccion = "SELECT *FROM DEVOLUCIONES";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Devolucion> devolucion = new ArrayList();
        for (Map registro : registros) {

            Devolucion dev = new Devolucion((int) registro.get("ID_devoluciones"),
                    (String) registro.get("descrip"),
                    (Date) registro.get("fecha"),
                    (int) registro.get("ID_prod"));

            devolucion.add(dev);

        }
        return devolucion;

    }

    public int Actualizar(int ID_devoluciones, String descrip, Date fecha, int ID_prod) {

        String transaccion = "UPDATE DEVOLUCIONES SET  descrip='"
                + descrip + "', fecha='"
                + fecha + "', ID_prod='"
                + ID_prod + "' WHERE ID_devoluciones= "
                + ID_devoluciones;
        return new DataBase().Actualizar(transaccion);
    }

    public int Eliminar(int id) {
        
        String transaccion = "DELETE FROM DEVOLUCIONES WHERE ID_devoluciones='" + id + "'";
        
        return new DataBase().Actualizar(transaccion);

    }
}
