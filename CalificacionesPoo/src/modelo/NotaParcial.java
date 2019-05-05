/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fredy
 */
public class NotaParcial {
    private double notaParcial;
    private double ponderacion;
    private double notaPonderada;

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(double ponderacion) {
        this.ponderacion = ponderacion;
    }

    public double getNotaPonderada() {
        return notaPonderada;
    }

    public void setNotaPonderada(double notaPonderada) {
        this.notaPonderada = notaPonderada;
    }
    public void calcularNotaPonderada(){
        this.notaPonderada = (this.notaParcial * this.ponderacion)/100;
    }
    
    
    
}
