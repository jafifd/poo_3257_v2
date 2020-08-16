/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.tarea;

/**
 *
 * @author jafif
 */
public class Autor {
   private String nombre;
   private String nacionalidad;

    public Autor() {
    }

    public Autor(String añoDeNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getnombre() {
        return nombre;
    }

    public void setAñoDeNacimiento(String añoDeNacimiento) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "a\u00f1oDeNacimiento=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }








}

