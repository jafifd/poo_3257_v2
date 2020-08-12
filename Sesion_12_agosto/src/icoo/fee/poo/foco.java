/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icoo.fee.poo;

/**
 *
 * @author jafif
 */
public class foco {
 private String material;
 private String tipo;
 private String marca;
 private boolean led;
 private float precio;
 
 
 public foco(){
        
 }
 public foco (String m){
     this.material=m ;
     
 }

    public foco(String material, String tipo, String marca, boolean led, float precio) {
        this.material = material;
        this.tipo = tipo;
        this.marca = marca;
        this.led = led;
        this.precio = precio;
    }
public void encender(){
    System.out.println("Encendiendo foco"+ this.marca);
    
}
    public void apagar(){
        System.out.println("Apagando el foco"+this.marca);
    }

    @Override
    public String toString() {
        return "foco{" + "material=" + material + ", tipo=" + tipo + ", marca=" + marca + ", led=" + led + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
