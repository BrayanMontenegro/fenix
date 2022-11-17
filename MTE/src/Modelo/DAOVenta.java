/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author Elieth
 */
public class DAOVenta {

    //Metodo para insertar datos a la base de datos
    public Venta Insertar(String articulo, java.sql.Date fecha, String precio, int codcli, int ID_empleado) {
        String transaccion = "INSERT INTO VENTAS VALUES ('"
                + articulo + "', '"
                + fecha + "', '"
                + precio + "', '"
                + codcli + "', '"
                + ID_empleado + "') ";

        if (new DataBase().Actualizar(transaccion) > 0) {
            return new Venta(articulo, fecha, precio, codcli, ID_empleado);
        }
        return null;
    }

    public List ObtenerDatos() {
        String transaccion = "SELECT *FROM VENTAS";

        List<Map> registros = new DataBase().Listar(transaccion);
        List<Venta> ventas = new ArrayList();
        for (Map registro : registros) {

            Venta ven = new Venta((int) registro.get("ID_venta"),
                    (String) registro.get("articulo"),
                    (java.sql.Date) registro.get("fecha"),
                    (String) registro.get("precio"),
                    (int) registro.get("codcli"),
                    (int) registro.get("ID_empleado"));

            ventas.add(ven);
        }
        return ventas;
    }

    public int Actualizar(int ID_venta, String articulo, Date fecha, String precio, int codcli, int ID_empleado) {
        String transaccion = "UPDATE VENTAS SET  articulo ='"
                + articulo + "', fecha='"
                + fecha + "', precio='"
                + precio + "', codcli='"
                + codcli + "', ID_empleado='"
                + ID_empleado + "' WHERE ID_venta= "
                + ID_venta;
        return new DataBase().Actualizar(transaccion);
    }

    
    
    
    
    public int Eliminar(int id) {

        String transaccion = "DELETE FROM VENTAS WHERE ID_venta='" + id + "'";

        return new DataBase().Actualizar(transaccion);

    }
}
