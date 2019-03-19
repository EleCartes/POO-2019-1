/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia3;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class EjercicioGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos variables
        String sexo,respuesta;
        float cantidad,porcentajeHombres,promedioEdad,edad, porcentaje;
        //inicializamos valores
        promedioEdad    = 0;
        cantidad        = 0;
        //Creamos objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);

        //Estructura de repetición do while
        do {
            System.out.print("¿Existen personas para analizar? [S/N]");
            respuesta = entrada.nextLine();
        }while(!(respuesta.equals("S") || respuesta.equals("N")) );
        
        //Ejecutamos la iteración mientras la respuesta sea S
        while(respuesta.equals("S")){
            cantidad++;
            System.out.print("Ingrese edad : ");
            edad = entrada.nextFloat();
            //Aumentamos el acumulador de edad (Las sumamos)
            promedioEdad = promedioEdad + edad;
            //Capturamos el sexo con una estructura de repetición
            do{
                System.out.print("Ingrese sexo M/F");
                sexo = entrada.nextLine();
            }while(!(sexo.equals("M") || sexo.equals("F")));
            
            
        }
        
        
        
    }
    
}
