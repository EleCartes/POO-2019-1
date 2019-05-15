/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author laboratorio2
 */
public class Cotizacion {
   private int costoCesped;
   private int costointalacion1y20=900;
   private int intalacion21y50=600;
   private int intalacionMayoa50=300;
   private double iva=0.19;
   private int cotizacion;
   private int metros;
   

    public int getCostoCesped() {
        return costoCesped;
    }

    public void setCostoCesped(int costoCesped) {
        this.costoCesped = costoCesped;
    }

    public int getCostointalacion1y20() {
        return costointalacion1y20;
    }

    public void setCostointalacion1y20(int costointalacion1y20) {
        this.costointalacion1y20 = costointalacion1y20;
    }

    public int getIntalacion21y50() {
        return intalacion21y50;
    }

    public void setIntalacion21y50(int intalacion21y50) {
        this.intalacion21y50 = intalacion21y50;
    }

    public int getIntalacionMayoa50() {
        return intalacionMayoa50;
    }

    public void setIntalacionMayoa50(int intalacionMayoa50) {
        this.intalacionMayoa50 = intalacionMayoa50;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(int cotizacion) {
        this.cotizacion = cotizacion;
    }
    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    public void CalcularCotizacion(){
    CalcularcostoCesped();
    CalcularIntalacion();
    
    }

    private void CalcularcostoCesped() {
    this.costoCesped=this.metros * 1800;
    
    }
    private void CalcularIntalacion(){
        if (this.metros < 20){ 
            this.costoCesped=this.costoCesped+this.costointalacion1y20;       
                if(this.metros>20 && this.metros<50){
                    this.costoCesped=this.costoCesped+this.intalacion21y50;
                            if(this.metros<50){
                                this.costoCesped=this.costoCesped+this.intalacionMayoa50;    
                             }    
                  }
         }
        
    }
    
    
    
}
    
        
        
        
        
        
        
        
        

