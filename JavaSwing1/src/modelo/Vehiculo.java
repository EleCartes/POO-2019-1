/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author fredy
 */
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int anho;
    private int antiguedad;
   

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    //Calculamos la antiguedad
    public void calcularAntiguedad(){
       
        //Al año actual le restamos la antiguedad
        int antiguedad = 2019 - this.anho;
        if(antiguedad==0){
            antiguedad = 1;
        }
        this.antiguedad = antiguedad;
                
    }

    
}
