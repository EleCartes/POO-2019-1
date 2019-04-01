/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos3;

import java.util.Scanner;

/**
 *
 * @author fredy
 * Defina un arreglo multidimensional de tamaño 12x2
 * para almacenar el numero de mes y la temperatura promedio
 * de cada uno.
 */
public class Arreglos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos un arreglo con los nombres de cada mes
        String meses[] ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        System.out.print(meses.length);
        //Declaramos el arreglo bidimensional de tamaño 12x2
        int temperaturasMensuales[][] = new int[12][2];
        //Creamos objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Efectuamos iteración para capturar datos
        for(int i =0;i < 12;i++){
            //Indicamos al usuario que ingrese la temperatura del mes indicado
            System.out.print("Ingrese temperatura del mes  "+ (i+1)+" : ");
            //Ingresamos el numero del mes en la columna con indice 0
            temperaturasMensuales[i][0] = i+1;
            temperaturasMensuales[i][1] = entrada.nextInt();
            
        }
        //Mostramos todos los valores ingresados
        for(int i=0;i <12;i++){          
                System.out.println("Temperatura del mes "+ temperaturasMensuales[i][0] + " es " + temperaturasMensuales[i][1]);
        }
        
        //Obtenemos el promedio de temperatura anual
        
        //Obtenemos el mes con la temperatura más alta
        
        //Obtenemos el mes con la temperatura más baja
        
    }
    
}
