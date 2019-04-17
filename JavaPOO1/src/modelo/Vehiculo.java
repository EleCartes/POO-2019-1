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
    private String marca;
    private String modelo;
    private String patente;
    private int anho;
    private int antiguedad;
    private boolean asegurable;
    
    

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

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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
    /* Calculamos la antiguedad del vehículo*/
    public void calcularAntiguedad(){
        int anho_actual = Calendar.getInstance().get(Calendar.YEAR);
        this.antiguedad = anho_actual - this.anho;
    }

    public boolean isAsegurable() {
        return asegurable;
    }

    public void setAsegurable(boolean asegurable) {
        this.asegurable = asegurable;
    }
    
}
