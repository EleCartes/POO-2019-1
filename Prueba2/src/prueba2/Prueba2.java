
package prueba2;
import Modelo.Cliente;
import Modelo.Cotizacion;
import java.util.Scanner;


public class Prueba2 {

    public static void main(String[] args) {
   
    Cliente cliente=new Cliente();
    Cotizacion cotizacion=new Cotizacion();
    
    
    
    SolicitarDaatos(cliente,cotizacion);
    MostrarResultados(cliente,cotizacion);
    MostrarResultadosCotizacion(cliente,cotizacion);    
    cotizacion.CalcularCotizacion();   
        
        
        
        
        
    }
   
    private static void SolicitarDaatos(Cliente cliente, Cotizacion cotizacion) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su rut :");
        int rut = entrada.nextInt();
        cliente.setRut(rut);
        entrada.nextLine();
        
        System.out.println("Ingrese su nombre:");
        String nombre=entrada.nextLine();
        cliente.setNombre(nombre);
       
        System.out.println("Ingrese sus apellidos :");
        String apelllidos=entrada.nextLine();
        cliente.setApellidos(apelllidos);
        
        System.out.println("Ingrese su email:");
        String email=entrada.nextLine();
        cliente.setEmail(email);
        
        System.out.println("Ingrese su numero de celular:");
        int celular=entrada.nextInt();
        cliente.setCelular(celular);
        
        System.out.println("Ingrese su direccion");
        String direccion=entrada.nextLine();
        cliente.setDireccion(direccion);
        
        System.out.println("Ingrese su comuna:");
        String comuna=entrada.nextLine();
        cliente.setComuna(comuna);
        
       
        System.out.println("Ingrese Cuantos rollos necesita (1 rollo mide un metro cuadrado):");
        int metros=entrada.nextInt();
        cotizacion.setMetros(metros);
        
        System.out.println("El costo del cesped es de $1800 por metro cuadrado.");
        
    
    
    
    
    }

    private static void MostrarResultados(Cliente cliente, Cotizacion cotizacion) {
        System.out.println("----DATOS DEL CLIENTE----");  
        System.out.println("RUT                  :"+cliente.getRut());
        System.out.println("NOMBRE               :"+cliente.getNombre());
        System.out.println("APELLIDOS            :"+cliente.getApellidos());
        System.out.println("EMAIL                :"+cliente.getEmail());
        System.out.println("NUMERO DE CELULAR    :"+cliente.getCelular());
        System.out.println("DIRECCION            :"+cliente.getDireccion());
        System.out.println("COMUNA               :"+cliente.getComuna());
        System.out.println("METROS SOLICITADOS   :"+cotizacion.getMetros());
        
    }

    private static void MostrarResultadosCotizacion(Cliente cliente, Cotizacion cotizacion) {
        System.out.println("Costo del Cesped:"+cotizacion.getCostoCesped());
        System.out.println("");
    }

    
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

