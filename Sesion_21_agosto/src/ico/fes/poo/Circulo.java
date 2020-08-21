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
public class Circulo implements Figura{

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void colorear() {
     System.out.println("Coloreando  un circulo");    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularArea() {
     System.out.println("Calculando area Pi* r ^2");  //To change body of generated methods, choose Tools | Templates.
    return 15;
    }
    
    
    
}
