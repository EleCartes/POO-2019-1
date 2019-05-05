/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remuneracionespoo;

import java.util.Scanner;
import modelo.Empleado;
import modelo.Remuneracion;

/**
 *
 * @author fredy
 */
public class RemuneracionesPOO {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
          //Variable para almacenar la respuesta.
         String respuesta = null;
        //Creamos objetos necesarios
        Empleado empleado = new Empleado();
        Remuneracion remuneracion = new Remuneracion();
        do{
        //Invocamos método para capturar datos
        capturarYAsignarValores(empleado,remuneracion);
        //Calculamos los datos de la remuneración. Esto lo delegamos a la clase Remuneración
        remuneracion.calcularRemuneracion();
        //Mostramos resultados enviando los objetos que tienen todos los datos
        mostrarResultados(empleado,remuneracion);
        respuesta = consultaContinuar();
        }while(respuesta.equals("s"));
        
    }

    private static void capturarYAsignarValores(Empleado empleado, Remuneracion remuneracion) {
         //Creamos objeto de la clase Scanner para capturar datos
         Scanner entrada = new Scanner(System.in);
         
         //Solicitamos y Capturamos RUT
         System.out.print("Ingrese RUT       :");
         String rut = entrada.nextLine();
        
         //Solicitamos y capturamos nombres
         System.out.print("Ingrese nombres   :");
         String nombres = entrada.nextLine();
         
         //Solicitamos y capturamos apellidos
         System.out.print("Ingrese apellidos :");
         String apellidos = entrada.nextLine();
         
         //Solicitamos y capturamos cantidad de horas trabajadas
         System.out.print("Ingrese horas trabajadas :");
         double horasTrabajadas = entrada.nextDouble();
         
         //Solicitamos y capturamos valor hora
         System.out.print("Ingrese valor hora       :");
         double valorHoraNormal = entrada.nextDouble();
         
         //Asignamos datos a las propiedades de cada objeto
         //Asignamos todas las propiedades al objeto de la clase Empleado
         empleado.setRut(rut);
         empleado.setNombres(nombres);
         empleado.setApellidos(apellidos);
         //Asignamos algunas  propiedades al objeto de la clase Remuneracion 
         remuneracion.setValorHoraNormal(valorHoraNormal);
         remuneracion.setHorasTrabajadas(horasTrabajadas);
         
    }

    private static void mostrarResultados(Empleado empleado, Remuneracion remuneracion) {
        System.out.println(" --  DATOS DEL EMPLEADO   --");
        System.out.println("RUT                     :"+empleado.getRut());
        System.out.println("NOMBRE COMPLETO         :"+empleado.getNombres()+" "+empleado.getApellidos());
        System.out.println(" -- DATOS DE REMUNERACION --");
        System.out.println("HORAS TRABAJADAS        :"+remuneracion.getHorasTrabajadas());
        System.out.println("HORAS EXTRAS(Sobre 40)  :"+remuneracion.getHorasExtras());
        System.out.println("VALOR HORA NORMAL       :"+remuneracion.getValorHoraNormal());
        System.out.println("VALOR HORA EXTRA        :"+remuneracion.getValorHoraExtra());
        System.out.println("-- INGRESOS  -- ");
        System.out.println("INGRESO NORMAL          :"+remuneracion.getIngresoNormal());
        System.out.println("INGRESO EXTRA           :"+remuneracion.getIngresoExtra());
        System.out.println("TOTAL INGRESOS          :"+remuneracion.getIngresoTotal());
        System.out.println("-- RETENCION --");
        System.out.println("RETENCION 10%           :"+remuneracion.getRetencion());
        System.out.println("--   PAGO    --");
        System.out.println("TOTAL A PAGO            :"+remuneracion.getPagoTotal());
    }

    private static String consultaContinuar() {
        String respuesta;
        System.out.println("¿Desea calcular  datos de otro empleado? Digite s para repetir o cualquier otra para terminar.");
        Scanner entrada = new Scanner(System.in);
        respuesta = entrada.nextLine();
        return respuesta;
    }

    
    
}
