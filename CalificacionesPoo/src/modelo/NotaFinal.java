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
public class NotaFinal {



  
    private double notaFinal;
    private int insuficientes;
    private String estado;

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
      public  void calcularNotaFinal(NotaParcial[] notasParciales) {
        //Recorremos el arreglo de notas para sumar las notas ponderadas 
        double sumaNotasPonderadas =0;
        for(int i=0;i< notasParciales.length;i++){
            //De cada objeto del arreglo obenemos la nota ponderada y la sumamos
            sumaNotasPonderadas =sumaNotasPonderadas + notasParciales[i].getNotaPonderada();
            //Determinamos si hay alguna nota insuficiente
            if(notasParciales[i].getNotaParcial() <4.0){
                this.insuficientes++;
            }
        }
        //Guardamos en el objeto, la nota final
        this.notaFinal = sumaNotasPonderadas;
        
    }

    public void determinarEstado() {
     if(this.notaFinal >= 5.0 && this.insuficientes==0){
         this.estado ="Aprobado";
     }    else{
         this.estado ="Debe dar examen.";
     }
    }

    public int getInsuficientes() {
        return insuficientes;
    }

    public void setInsuficientes(int insuficientes) {
        this.insuficientes = insuficientes;
    }
    
}
