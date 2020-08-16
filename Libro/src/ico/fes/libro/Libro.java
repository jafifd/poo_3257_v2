/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.libro;

import ico.fes.tarea.Autor;
import ico.fes.tarea.Editorial;

/**
 *
 * @author jafif
 */
public class Libro {
    String nombre;
     Autor autor;
    Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, String edicion, Autor autor, Editorial editorial) {
        this.nombre = nombre;
       
       
     this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + 
                ", editorial=" + editorial + '}';
    }

   
    
}
