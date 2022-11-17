/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elieth
 */
public class DAOVenta {
    public Venta Insertar(String articulo, String fecha, String precio, int codcli, int id_empleado) {
        String transaccion = "INSER INTO VENTAS VALUES ('"
                + articulo + "', '"
                + fecha + "', '"
                +  precio + "', '"
                + codcli + "', '"
                + id_empleado + "') ";
        
        if (new DataBase().Actualizar(transaccion) > 0) {
            return new  Venta(articulo, fecha, precio, codcli, id_empleado);
    }
        return null;
}
    
 public List ObtenerDatos() {
        String transaccion = "SELECT *FROM VENTAS";

List<Map> registros = new DataBase().Listar(transaccion);
        List<Venta> vent = new ArrayList();
        for (Map registro : registros) {
            
            Venta ve= new Venta((int) registro.get("ID_venta"),
                    (String) registro.get("articulo"),
                    (String) registro.get("fecha"),
                    (String) registro.get(" precio"), 
                    (int) registro.get("codcli"),
                    (int) registro.get("id_empleado"));
            
            vent.add(ve);
        }
        return vent;
 }
}