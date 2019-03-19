/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Elabore una aplicación que capture número mientras sean mayores a cero.
     * Al finalizar muestre promedio, cantidad de pares e impares.
     */
    public static void main(String[] args) {
        //Declaramos variables
        int numero;
        int suma                = 0;
        int contadorPar         = 0;
        int contadorImpar       = 0;
        
        //Creamos objeto, solicitamos dato e capturamos.
        Scanner objetoEntrada   = new Scanner(System.in);
        System.out.print("Ingrese número :");
        numero                  = objetoEntrada.nextInt();
        
        //Efectuamos la iteración con while
        while(numero > 0){
            //Sumamos los valores
            suma = suma + numero;
            //Evaluamos si es par o impar
                if(numero %2 == 0){
                    //Si es par, aumentamos el contador
                    contadorPar++;
                }else{
                    contadorImpar++;
                }
            //Capturamos el valor siguiente
            Scanner objetoEntrada2  = new Scanner(System.in);
            System.out.print("Ingrese número :");
            numero                  = objetoEntrada2.nextInt();
        }
        //Mostramos los resultados
        System.out.println("Suma              :"+ suma);
        System.out.println("Cantidad pares    :"+contadorPar);
        System.out.println("Cantidad impares  :"+contadorImpar);
        
        
        
        
    }
    
}
