/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_14_agosto;

import MX.lenovo.Computadora;
import icoo.fes.componentes.Cpu;
import icoo.fes.componentes.Monitor;

/**
 *
 * @author jafif
 */
public class Sesion_14_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora c1=new Computadora();
        
        System.out.println(c1);  
        Computadora c2=new Computadora("Lenovo","LM2010", 
                new Monitor("Samsung", 32), 
                new Cpu("Intel", 3.2f, 8)
                ,null,null);
               System.out.println(c2);
   
    
    }
    
}
