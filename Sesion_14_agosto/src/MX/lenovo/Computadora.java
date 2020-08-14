/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MX.lenovo;

import icoo.fes.componentes.Cpu;
import icoo.fes.componentes.Monitor;
import icoo.fes.componentes.Mouse;
import icoo.fes.componentes.Teclado;

/**
 *
 * @author jafif
 */
public class Computadora {
  String marca;
  String modelo;
    Monitor mi_monitor;
    Cpu mi_cpu_;
    Teclado mi_teclado;
    Mouse mi_raton;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor mi_monitor, Cpu mi_cpu_, Teclado mi_teclado, Mouse mi_raton) {
        this.marca = marca;
        this.modelo = modelo;
        this.mi_monitor = mi_monitor;
        this.mi_cpu_ = mi_cpu_;
        this.mi_teclado = mi_teclado;
        this.mi_raton = mi_raton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getMi_monitor() {
        return mi_monitor;
    }

    public void setMi_monitor(Monitor mi_monitor) {
        this.mi_monitor = mi_monitor;
    }

    public Cpu getMi_cpu_() {
        return mi_cpu_;
    }

    public void setMi_cpu_(Cpu mi_cpu_) {
        this.mi_cpu_ = mi_cpu_;
    }

    public Teclado getMi_teclado() {
        return mi_teclado;
    }

    public void setMi_teclado(Teclado mi_teclado) {
        this.mi_teclado = mi_teclado;
    }

    public Mouse getMi_raton() {
        return mi_raton;
    }

    public void setMi_raton(Mouse mi_raton) {
        this.mi_raton = mi_raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + 
                ", mi_monitor=" + mi_monitor + ", mi_cpu_=" + mi_cpu_ +
                ", mi_teclado=" + mi_teclado + ", mi_raton=" + mi_raton + '}';
    }
    
    
    
}
