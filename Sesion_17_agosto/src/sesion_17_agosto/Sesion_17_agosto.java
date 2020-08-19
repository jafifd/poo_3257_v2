/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_17_agosto;

import ico.fes.poo.VehiculoTerrestre;
import ico.fes.poo.vehiculo;
import ico.fes.poo.vehiculoAereo;

/**
 *
 * @author jafif
 */
public class Sesion_17_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   vehiculo v1 =new vehiculo("Motorizado con una adaptacion de bicicleta de tamalero para "
           + "fabricar persona","BMX", "Metal");
        System.out.println(v1);
        v1.usas();
        System.out.println("------------------");
        vehiculo v2 = new vehiculo("Vehiculo que vuela", "Desconocido","Madera");
        System.out.println(v2);
        System.out.println("herencia");
        
        
        VehiculoTerrestre vt1=new VehiculoTerrestre();
        System.out.println(vt1);
        vt1.usas();
        VehiculoTerrestre vt2 = new VehiculoTerrestre(0, "210");//mazda3
    vt2.setDescripcion("Vehiculo semideportivo");
    vt2.setFabricante("Mazda");
    vt2.setMaterial("Metal y fibra de vidrio");
        System.out.println(vt2);
        System.out.println("Vehiculo terrestre 3");
        VehiculoTerrestre vt3= new VehiculoTerrestre(1,"250",
                "Ferrocaril clasico", "Aceros de Mexico","Acero");
        System.out.println(vt3);
        vt3.viajar();
        vt3.usas();
    
        System.out.println("Vehiculo Aereo");
        vehiculoAereo va1= new vehiculoAereo(2,"Jet",1000.0f);
   
        System.out.println(va1);
        va1.usas();
        vehiculo vx =(vehiculo)va1;
        vx.usas();
        
        
        
    }
    
}
