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
public class Remuneracion {
    private double horasTrabajadas;
    private double horasExtras;
    private double valorHoraNormal;
    private double valorHoraExtra;
    private double ingresoNormal;
    private double ingresoExtra;
    private double ingresoTotal;
    private double retencion;
    private double pagoTotal;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getIngresoNormal() {
        return ingresoNormal;
    }

    public void setIngresoNormal(double ingresoNormal) {
        this.ingresoNormal = ingresoNormal;
    }

    public double getIngresoExtra() {
        return ingresoExtra;
    }

    public void setIngresoExtra(double ingresoExtra) {
        this.ingresoExtra = ingresoExtra;
    }

    public double getIngresoTotal() {
        return ingresoTotal;
    }

    public void setIngresoTotal(double ingresoTotal) {
        this.ingresoTotal = ingresoTotal;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    public  void calcularRemuneracion() {

        calcularValorHoraExtra();
        calcularIngresoNormal();
        calcularHorasExtras();
        calcularIngresoExtra();
        calcularIngresoTotal();
        calcularRetencion();
        calcularPagoTotal();
    }

    private  void calcularValorHoraExtra() {
        //Se incrementa el valor hora en un 50%
        this.valorHoraExtra = this.valorHoraNormal * 1.5;
        
    }

    private  void calcularIngresoNormal() {
          //Determinamos el pago normal. Si es mayor a 40 se paga el topo, sino, lo efectivamente trabajado.
          if(this.horasTrabajadas>40){
              this.ingresoNormal = 40* this.valorHoraNormal;
          }else{
              this.ingresoNormal = this.horasTrabajadas * this.valorHoraNormal;
          }
  
    }

    private void calcularIngresoExtra() {
          //Determinamos el pago extra
          if(this.horasTrabajadas>40){
              this.ingresoExtra = this.horasExtras * this.valorHoraExtra;
          }
    }

    private  void calcularHorasExtras() {
            //determinamos la cantidad de horas extras
          if(this.horasTrabajadas> 40){
             this.horasExtras = this.horasTrabajadas - 40;
          }
          
    }

    private void calcularIngresoTotal() {
       this.ingresoTotal = this.ingresoNormal + this.ingresoExtra;
    }

    private void calcularRetencion() {
        this.retencion = this.ingresoTotal * 0.10;
    }

    private void calcularPagoTotal() {
        this.pagoTotal = this.ingresoTotal - this.retencion;
    }
    
}
