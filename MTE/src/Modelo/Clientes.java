/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elieth
 */
public class Clientes {

    public Clientes(int codcli, String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc) {
        this.codcli = codcli;
        this.nomb1 = nomb1;
        this.nomb2 = nomb2;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.numcelu = numcelu;
        this.direc = direc;
    }

    public Clientes(String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc) {
        this.nomb1 = nomb1;
        this.nomb2 = nomb2;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.numcelu = numcelu;
        this.direc = direc;
    }

    public int getCodcli() {
        return codcli;
    }

    public void setCodcli(int codcli) {
        this.codcli = codcli;
    }

    public String getNomb1() {
        return nomb1;
    }

    public void setNomb1(String nomb1) {
        this.nomb1 = nomb1;
    }

    public String getNomb2() {
        return nomb2;
    }

    public void setNomb2(String nomb2) {
        this.nomb2 = nomb2;
    }

    public String getApell1() {
        return apell1;
    }

    public void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    public String getApell2() {
        return apell2;
    }

    public void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    public String getNumcelu() {
        return numcelu;
    }

    public void setNumcelu(String numcelu) {
        this.numcelu = numcelu;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    
    private int codcli;
    private String nomb1;
    private String nomb2;
    private String apell1;
    private String apell2;
    private String numcelu;
    private String direc;
   
}
