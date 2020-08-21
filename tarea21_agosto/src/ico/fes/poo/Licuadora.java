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
public class Licuadora  extends Electrodomestico{
    private String numeroDeRevoluciones;
    private String Garantia;
    private String tipo;
    private int botones;

    public Licuadora() {
    }

    public Licuadora(String numeroDeRevoluciones, String Garantia, String tipo, int botones, String marca, String descripcion, String voltaje, String año) {
        super(marca, descripcion, voltaje, año);
        this.numeroDeRevoluciones = numeroDeRevoluciones;
        this.Garantia = Garantia;
        this.tipo = tipo;
        this.botones = botones;
    }

    public String getNumeroDeRevoluciones() {
        return numeroDeRevoluciones;
    }

    public void setNumeroDeRevoluciones(String numeroDeRevoluciones) {
        this.numeroDeRevoluciones = numeroDeRevoluciones;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Override
    public String toString() {
        return "Licuadora{" + "numeroDeRevoluciones=" + numeroDeRevoluciones + ", Garantia=" + Garantia + ", tipo=" + tipo + ", botones=" + botones + '}'+ super.toString();
    }

   
}
