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
public class vehiculo {
 private String descripcion;
 private String fabricante;
 private String material;

    public vehiculo() {
    }

    public vehiculo(String descripcion, String fabricante, String material) {
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "descripcion=" + descripcion + ", fabricante=" 
                + fabricante + ", material=" + material + '}';
    }
 
 
 
public void usas(){
    System.out.println(
            "Utilizando el ferrocarril que viaja en vias ferreas "
               +" de la marca " +this.getFabricante());
}
}
