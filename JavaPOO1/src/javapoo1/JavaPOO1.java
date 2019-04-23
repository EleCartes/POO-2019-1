/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo1;

import java.util.Scanner;
import modelo.Seguro;
import modelo.Vehiculo;

/**
 *
 * @author fredy
 */
public class JavaPOO1 {

    /**
     * @param args the command line arguments
     * Elabore un programa en Java que determine el monto a pagar
     * por concepto de seguro automotriz. Considere un valor de 
     * 0,1 UF por cada año de antiguedad.
     * Sólo es posible asegurar vehiculos con 10 años o menos.
     * Solicite Marca, modelo, patente y año del vehículo y
     * al finalizar indique si este es asegurable o no y en caso
     * de ser asegurable el monto del seguro.
     */
    
    public static void main(String[] args) {
         //Declaramos variable para almacenar temporalmente los datos capturados
        String marca, modelo,patente;
        int anho;
        // Capturamos los valores requeridos para el procesamiento
        Scanner entrada = new Scanner(System.in);
        //Solicitamos al usuario incorporar la marca
        System.out.print("Ingrese marca             : ");
        marca = entrada.nextLine();
        //Solicitamos al usuario incorporar el modelo
        System.out.print("Ingrese modelo            : ");
        modelo = entrada.nextLine();
        //Solicitamos al usuario incorporar la patente
        System.out.print("Ingrese patente           : ");
        patente = entrada.nextLine();
        //Solicitamos al usuario incorporar el año del vehículo
        System.out.print("Ingrese año del vehiculo  : ");
        anho = entrada.nextInt();
        
        //Creamos un objeto de la clase Vehiculo y Seguro
         Seguro seguro = new Seguro();
         Vehiculo vehiculo = new Vehiculo();
        //Establecemos propiedades para el seguro
        seguro.setNombre("Seguro de daños a terceros");
        seguro.setValorUf(27500);
       
        
       
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setPatente(patente);
        vehiculo.setAnho(anho);
        
     

        //Calcular valores
        calcularValores(vehiculo,seguro);
        //Invocamos el método mostrarResultados enviándo los datos que necesita (objetos)
        mostrarResultados(vehiculo,seguro);
    
       
        
        
 
    }
  
    public static void calcularValores(Vehiculo vehiculo,Seguro seguro){
                //Invocamos el método que calcula la antiguedad
        vehiculo.calcularAntiguedad();
        //Calculamos el valor del seguro
        seguro.calcularValorSeguro(vehiculo.getAntiguedad());
        //Establecemos en la propiedad si es asegurable o no
        vehiculo.setAsegurable(seguro.determinarAsegurabilidad(vehiculo.getAntiguedad()));
    }
    public static void mostrarResultados(Vehiculo vehiculo, Seguro seguro){
        //Probamos la clase mostrando la antiguedad
        if(vehiculo.isAsegurable()){
            System.out.println("El vehículo es asegurable");
            System.out.print("Valor del seguro es $"+seguro.getValorSeguro());
        }else{
            System.out.println("El vehículo no es asegurable");
        }
        
        
    }


    
}
