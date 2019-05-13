
package prueba;


class Cesped {
    private int costoRollo=1800;
    private double cantidadMetros;
    private double costoInstalacion;
    private double costoCesped;
    private double totalbruto;
    private double totalNeto;
    private double iva;
    private double total;
    
    

    public int getCostoRollo() {
        return costoRollo;
    }

    public void setCostoRollo(int rollo) {
        this.costoRollo = rollo;
    }
    

    public double getCantidadMetros() {
        return cantidadMetros;
    }

    public void setCantidadMetros(double cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }

    public double getCostoInstalacion() {
        if(cantidadMetros < 21){
            costoInstalacion = cantidadMetros *900;
        }else{
            if(cantidadMetros > 20 && cantidadMetros < 51){
                costoInstalacion = cantidadMetros * 600;
            }else{
                costoInstalacion = cantidadMetros * 300;
            }
        }
        return costoInstalacion;
    }

    public void setCostoInstalacion(double costoInstalacion) {
        this.costoInstalacion = costoInstalacion;
    }

    public double getCostoCesped() {
        return costoCesped;
    }

    public void setCostoCesped(double costoCesped) {
        this.costoCesped = costoCesped;
    }

    public double getTotalbruto() {
        return totalbruto;
    }

    public void setTotalbruto(double totalbruto) {
        this.totalbruto = totalbruto;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = (int) total;
    }
    
    
}
