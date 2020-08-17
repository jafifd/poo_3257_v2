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
public class VehiculoTerrestre extends vehiculo {
    private int tipo ; //0: neumaticos ,1:vias ferreas , 2: Magnetico
    private String kmPorHora;

    public VehiculoTerrestre() {
    }

    public VehiculoTerrestre(int tipo, String kmPorHora) {
        this.tipo = tipo;
        this.kmPorHora = kmPorHora;
    }

    public String getKmPorHora() {
        return kmPorHora;
    }

    public void setKmPorHora(String kmPorHora) {
        this.kmPorHora = kmPorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" + "tipo=" + tipo + ", kmPorHora=" + 
                kmPorHora + '}'+ super.toString() ;
    }
public int viajar(){
    System.out.print("El vehiculo terrestre esta viajando");
 switch(this.tipo){
     case 0 :
    System.out.println("Carretera");
break;
 case 1 :
    System.out.println("Vias Ferreas");
break;
 case 2 :
    System.out.println("Vias Magneticas");
break;
 
 default:
     System.out.println("No reconocible....");
         }
    return 100 ;
    
}





}

