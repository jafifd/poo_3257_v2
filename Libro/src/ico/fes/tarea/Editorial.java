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
public class Editorial {
private String nombre; 
private String lugar;
    public Editorial() {
    }

    public Editorial(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", lugar=" + lugar + '}';
    }
    
}
