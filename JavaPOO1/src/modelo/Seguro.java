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
public class Seguro {
    private String nombre;
    private double valorSeguro;
    private double valorUf;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorUf() {
        return valorUf;
    }

    public void setValorUf(double valorUf) {
        this.valorUf = valorUf;
    }
    public boolean determinarAsegurabilidad(int antiguedad){
        boolean asegurable;
            if(antiguedad <= 10){
                asegurable = true;
            }else{
                asegurable = false;
            }
        return asegurable;
    }
    public void calcularValorSeguro(int antiguedad){
       
        this.valorSeguro = (antiguedad * this.valorUf)/10;
            
        
    
    }
    
}
