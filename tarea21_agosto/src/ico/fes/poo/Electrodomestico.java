/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author jafif
 */
public class Electrodomestico {
   private String marca;
   private String descripcion;
   private String voltaje ;
   private String año;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String descripcion, String voltaje, String año) {
        this.marca = marca;
        this.descripcion = descripcion;
        this.voltaje = voltaje;
        this.año = año;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "marca=" + marca + ", descripcion=" + descripcion + ", voltaje=" + voltaje + ", a\u00f1o=" + año + '}';
    }
   
   
   
   
}
