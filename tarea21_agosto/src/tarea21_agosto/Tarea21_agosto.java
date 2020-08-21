/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea21_agosto;

import ico.fes.poo.Licuadora;
import ico.fes.poo.Refrigerador;

/**
 *
 * @author jafif
 */
public class Tarea21_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Refrigerador elec1=new Refrigerador("15 pies",2,"3","10 años","Samsung",
                "Refrigerador plateado","100 volts","2020");// TODO code application logic here
    
        System.out.println(elec1);
  
        Licuadora elec2=new Licuadora("7","5 años","domestica",9,"whirrpoll","licuadora de uso domestico rojo","50 volts","2020");
        System.out.println(elec2);
    }
    
}
