/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icoo.fes.componentes;

/**
 *
 * @author jafif
 */
public class Teclado {
 String marca;
 int numeroTeclas;
 boolean multimedia;
 //true es multimedia false no es multimedia

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas, boolean multimedia) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + ", multimedia=" + multimedia + '}';
    }

}

