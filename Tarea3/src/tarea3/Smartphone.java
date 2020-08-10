/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author jafif
 */
 public class Smartphone {
    public String marca;
     private String modelo;
     private String año;
     private int android;
     
    public int getAndroid(){
        return android;
    }
    public void setAndroid(int Android){
        this.android = Android;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String Marca){
        this.marca = Marca;
        
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String Modelo){
        this.modelo = Modelo;
    }
    public String getAño(){
        return año;
    }
    public void setAño(String Año){
        this.año = Año;
                
    }
    public String toString(){
       return this.marca+","+ this.modelo +","
        + this.año +","+this.android ;  
       
    }
 }

