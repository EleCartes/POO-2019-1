
package prueba;

import java.util.Scanner;


public class Prueba {

   
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Cesped cesped = new Cesped();
        
        solicitarYasignarDatos(cliente,cesped);
        calcularCostos(cliente,cesped);
        mostrarResultados(cliente,cesped);
    }

    private static void solicitarYasignarDatos(Cliente cliente, Cesped cesped) {

        String rut,nombre,apellido,email,comuna,direccion;
        int celular;
        double cantidadMetros;
        
        Scanner in = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        System.out.print("Ingrese rut :");
        rut = in.nextLine();
        cliente.setRut(rut);
        System.out.print("Ingrese nombre :");
        nombre = in.nextLine();
        cliente.setNombre(nombre);
        System.out.print("Ingrese apellido :");
        apellido = in.nextLine();
        cliente.setApellido(apellido);
        System.out.print("Ingrese email :");
        email = in.nextLine();
        cliente.setEmail(email);
        System.out.print("Ingrese dirección :");
        direccion = in.nextLine();
        cliente.setDireccion(direccion);
        System.out.print("Ingrese comuna :");
        comuna = in.nextLine();
        cliente.setComuna(comuna);
        System.out.print("Cantidad de metros :");
        cantidadMetros = num.nextDouble();
        cesped.setCantidadMetros(cantidadMetros);
        
        
    }

    private static void calcularCostos(Cliente cliente, Cesped cesped) {
        double costoCesped,totalBruto;
        costoCesped = calcularCostoCesped(cesped);
        cesped.getCostoInstalacion();
        calcularNeto(cesped);
        calcularBruto(cesped);
        calcularTotal(cesped);
        
        
    }

    private static double calcularCostoCesped(Cesped cesped) {
        double costoCesped;
        costoCesped = cesped.getCostoRollo() * cesped.getCantidadMetros();
        cesped.setCostoCesped(costoCesped);
        return costoCesped;
    }

    private static void calcularNeto(Cesped cesped) {
        double totalneto;
        totalneto = cesped.getCostoCesped() + cesped.getCostoInstalacion();
        cesped.setTotalNeto(totalneto);
        
    }

    private static void calcularBruto(Cesped cesped) {
        double totalbruto,iva;
        totalbruto = cesped.getTotalNeto() * 1.19;
        iva = cesped.getTotalNeto() * 0.19;
        cesped.setIva(iva);
        cesped.setTotalbruto(totalbruto);
        
    }
    private static void calcularTotal(Cesped cesped) {
        double total;
        total = cesped.getTotalNeto() + cesped.getIva();
        cesped.setTotal(total);
    }

    private static void mostrarResultados(Cliente cliente,Cesped cesped) {
        System.out.println("***********FACTURA***********");
        System.out.print("Nombre :"+cliente.getNombre());
        System.out.print("Apellido :"+cliente.getApellido());
        System.out.println("Email :"+cliente.getEmail());
        System.out.println("Dirección :"+cliente.getDireccion());
        System.out.println("Comuna :"+cliente.getComuna());
        System.out.println("Metros comprados :"+cesped.getCantidadMetros());
        System.out.println("Producto :"+cesped.getCostoCesped());
        System.out.println("Instalación :"+cesped.getCostoInstalacion()); 
        System.out.println("TOTAL NETO :"+cesped.getTotalNeto());
        System.out.println("TOTAL IVA :"+cesped.getIva());
        System.out.println("TOTAL BRUTO :"+cesped.getTotalbruto()); 
        System.out.println("TOTAL :"+cesped.getTotal());
        
        
    }

    
    
    
}
