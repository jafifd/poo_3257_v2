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
    public class Refrigerador extends Electrodomestico {
      private String Altura;
      private int puerta;
      private String Compartimento;
      private String garantia;

    public Refrigerador() {
    }

    public Refrigerador(String Altura, int puerta, String Compartimento, String garantia, String marca, String descripcion, String voltaje, String año) {
        super(marca, descripcion, voltaje, año);
        this.Altura = Altura;
        this.puerta = puerta;
        this.Compartimento = Compartimento;
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public String getCompartimento() {
        return Compartimento;
    }

    public void setCompartimento(String Compartimento) {
        this.Compartimento = Compartimento;
    }

    @Override
    public String toString() {
        return "Refrigerador{" + "Altura=" + Altura + ", puerta=" + puerta + ", Compartimento=" + Compartimento + ", garantia=" + garantia + '}'+super.toString();
    }
      
        
      
    
}
