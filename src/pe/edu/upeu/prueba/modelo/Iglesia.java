/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.modelo;

/**
 *
 * @author alum.fial7
 */
public class Iglesia {
    private int idi;
    private int idd;
    private int idt;
    private String disc;
    private String stado;

    public Iglesia() {
    }

    public Iglesia(int idd, int idt, String disc, String stado) {
        this.idd = idd;
        this.idt = idt;
        this.disc = disc;
        this.stado = stado;
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getStado() {
        return stado;
    }

    public void setStado(String stado) {
        this.stado = stado;
    }
    
}
