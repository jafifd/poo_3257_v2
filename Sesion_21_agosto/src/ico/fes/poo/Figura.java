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
public interface Figura {
    public static final int Circulo = 0;
    public static final int  Cuadrado = 1;
    public static final int Triangulo  = 2;
    
    public  abstract void dibujar();
    public void colorear();
    public int calcularArea();
    
    
}
