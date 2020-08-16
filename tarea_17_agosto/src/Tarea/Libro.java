/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import datos.editorial;

/**
 *
 * @author jafif
 */
public class Libro {
    private String autor ;
    private String año ;
    private editorial Editorial;

    public Libro() {
    }

    public Libro(String autor, String año, editorial Editorial) {
        this.autor = autor;
        this.año = año;
        this.Editorial = Editorial;
    }

    public Libro(String secretos_de_1910, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public editorial getEditorial() {
        return Editorial;
    }

    public void setEditorial(editorial Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", a\u00f1o=" + año + ", editorial=" + Editorial + '}';
    }

    
    
    
    
    
}
  
