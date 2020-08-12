/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_12_agosto;

import icoo.fee.poo.foco;

/**
 *
 * @author jafif
 */
public class Sesion_12_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        foco f1= new foco();
        System.out.println(f1);
        foco f2=new foco("Phillips");
        System.out.println(f2);
        foco f3=new foco("Cristal","led", "Boch", true, 60.00f);
        System.out.println(f3);
    }
    
}
