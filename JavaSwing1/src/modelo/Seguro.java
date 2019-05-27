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
    private double valorSeguro;
    private double valorUF = 27500;
    private boolean asegurable;

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorUF() {
        return valorUF;
    }

    public void setValorUF(double valorUF) {
        this.valorUF = valorUF;
    }

    public boolean isAsegurable() {
        return asegurable;
    }

    public void setAsegurable(boolean asegurable) {
        this.asegurable = asegurable;
    }
    public void calcularValorSeguro(int antiguedad){
        //Recibimos la antiguedad del vehículo
        //Calculamos el valor del seguro
        //Es necesario contar además con el valor de la UF
        
        this.valorSeguro = (antiguedad * this.valorUF)/10;
        
    }
    public void determinarAsegurabilidad(int antiguedad){
        this.asegurable = false;
        if(antiguedad <=10){
            this.asegurable = true;
        }
    }
    
    
}
