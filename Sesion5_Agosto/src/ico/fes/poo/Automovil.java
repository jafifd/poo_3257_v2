/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;


public class Automovil {
private String Marca;
private String SubMarca;
private int modelo;
private String Color;

//metodos de Acceso
public void setModelo(int mod ){
    if(mod >= 1914 && mod <=2020){
        this.modelo= mod;
    }else{
        System.out.println("Ese modelo esta fuera de rango");
    }
}

public int setModelo(){
    return this.modelo;
}
public String setMarca(){
   return Marca;
}
public void setMarca(String Marca){
   this.Marca = Marca;
}
public void setSubMarca(String SubMarca){
    this .SubMarca= SubMarca;
}
public String setSubMarca(){
    return SubMarca;
    
}
public void setColor(String Color){

    this.Color = Color;
   
    }
public String setColor(){
    return Color;
}
     



            



public void encender (){
    System.out.println("Encendiendo el auto");
}
public void acelerar(){
   System.out.println("Acelerando");

}
public float avanzar (int metros ){
    float reales=0.0f;
    reales = (float) Math.random()*(float)metros;
    System.out.println("Avanzando el auto"+this.Marca);
    return reales;
    
    }

    @Override
    public String toString() {
        return this.Marca+","+ this.SubMarca +","
        + this.modelo +","+this.Color ; //To change body of generated methods, choose Tools | Templates.
    }


}
