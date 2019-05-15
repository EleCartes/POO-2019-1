package evaluacion2;

import static java.lang.System.in;

/**
 *
 * @author laboratorio2
 */
public class Evaluacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cesped cesped = new Cesped();
       
        solicitarYasignarDatos(Cliente,cesped);
        calcularCosto(cliente,cesped);
    }
    private static void solicitarYasignarDatos(Cliente cliente){
    
    String rut,nombre,apellido,email,comuna,direccion;
    int celular;

 System.out print("ingrese rut");
    System.out print("ingrese nombre");
    nombre= in.nextLine();
    cliente = setNombre(nombre);
    System.out print("ingrese apellido");
    apellido = in.nexLine();
    System.out print("ingrese rut");
    System.out print("ingrese nombre");
    nombre= in.nextLine();
    cliente = setNombre(nombre);
    System.out print("ingrese apellido");
    apellido = in.nexLine();
    cliente = setApellido(apellido);
    System.out print ("ingrese direccion");
    direccion = in.nextLine();
    cliente = setDireccion(direccion);
    System.out print("ingrese comuna");
    comuna = in.nextLine();
    cliente = setComuna(comuna);

private static void calcularCostos(Cliente cliente , Cesped cesped){
double costoCesped,totalBruto;
costoCesped=calcularCostoCesped(cesped);
Cesped.getCostoInstalacion();
calcularBruto(cesped);
calcularNeto();

}

private static double calcularCostoCesped(Cesped cesped){
double costoCesped;
costoCesped= cesped.getCostoRollo() * cesped.getCantidadMetros();

return costoCesped;

}

private static void calcularNeto(){
double totalNeto;
totalNeto = cesped.getCostoCesped() + cesped.getCostoInstalacion;
cesped.setTotalNeto(totalNeto);

}

private static void calcularBruto(Cesped cesped){
double totalBruto.iva;
totalBruto = cesped.getTotalNeto() * 1.19;
iva = cesped.getTotalneto() * 0.19;
cesped = setIva(iva);
cesped.setTotalbruto(totalBruto);

}



    
   
    
    
    
    
}
