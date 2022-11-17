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
 * @author Oreki
 */
public class DAOCliente {
    public Clientes insertar(int codcli, String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc){
        String transaccion = "INSERT INTO CLIENTES VALUES('"   
            +codcli+", "
            +nomb1+"','"
            +nomb2+"','"
            +apell1+"','"
            +apell2+"','"
            +numcelu+"','"
            +direc+"')";
        
        if (new  DataBase().Actualizar(transaccion)>0) {
            
            return new Clientes (nomb1, nomb2, apell1, apell2, numcelu, direc);
        }
        return null;
    }  
   public List ObtenerDatos(){
        
        String transaccion ="SELECT * FROM CLIENTES";   
         List<Map> registros = new  DataBase().Listar(transaccion);
        List<Clientes> clientes = new ArrayList();
        for (Map registro : registros){
        

Clientes cs = new Clientes ((int) registro.get("codcli"),
                    (String) registro.get("nomb1"),(String) registro.get("nomb2"),
                    (String) registro.get("apell1"),(String) registro.get("apell2"),
                    (String) registro.get("numcelu"),(String) registro.get("direc"));
                    
                    
                    clientes.add(cs);
            
        }
        
        return clientes;
    }
   
}
    
