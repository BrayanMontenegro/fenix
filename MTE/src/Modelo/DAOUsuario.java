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
public class DAOUsuario {
    public Usuarios insertar(int ID_empleado, String nomb1, String nomb2, String apell1, String apell2, String numcelu,String direc) {
        String transaccion = "INSERT INTO VENDEDORES VALUES('"
                + ID_empleado+ "',' "
                + nomb1+ "',' "
                +nomb1+"','"
                +nomb2+"','"
                +apell1+"','"
                +apell2+"','"
                +numcelu+"','"
                +direc+"',)";
                
        if (new  DataBase().Actualizar(transaccion)>0) {
            
            return new Usuarios(nomb1, nomb2, apell1, apell2, numcelu, direc);
            
        }
        return null;
    }
    
     public List ObtenerDatos(){
        
        String transaccion ="SELECT * FROM VENDEDORES";   
         List<Map> registros = new  DataBase().Listar(transaccion);
        List<Usuarios> usuari = new ArrayList();
        for (Map registro : registros){
            
Usuarios us = new Usuarios((int) registro.get("ID_empleado"),
                    (String) registro.get("nomb1"),(String) registro.get("nomb2"),
                    (String) registro.get("apell1"),(String) registro.get("apell2"),
                    (String) registro.get("numcelu"),(String) registro.get("direc"));

usuari.add(us);
        }
        return usuari;
     }
}
