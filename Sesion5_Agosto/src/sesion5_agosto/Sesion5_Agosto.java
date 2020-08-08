/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5_agosto;

import ico.fes.poo.Automovil;

/**
 *
 * @author jafif
 */
public class Sesion5_Agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Automovil miCarro=new Automovil();
     //miCarro.Marca=" chevrolet";
     //miCarro.SubMarca="cavalier";
     //miCarro.modelo=2016;
     //miCarro.color="negro";
     miCarro.setModelo(2075);
     float x = miCarro.avanzar(100);
        System.out.println("Avanzados="+x);
        
        Automovil miCarroDos= new Automovil();
        //miCarroDos.Marca="ford";
        //miCarroDos.SubMarca="Mustang";
        //miCarroDos.color="Amarillo";
        //miCarroDos.modelo= 2010;
        miCarroDos.setModelo(2010);
        System.out.println("Avanzados="+ miCarroDos.avanzar(500));
        
        System.out.println(miCarro);
        System.out.println(miCarroDos);
        
        
        Automovil miCarroTres= new Automovil();
        //miCarroTres.Marca ="Acura";
        //miCarroTres.SubMarca="NSX";
        //miCarroTres.color="gris";
        //miCarroTres.modelo=2013;
        System.out.println("Avanzados="+ miCarroTres.avanzar(500));
        
        System.out.println(miCarro.toString());          
// TODO code application logic here
    }
    
}
