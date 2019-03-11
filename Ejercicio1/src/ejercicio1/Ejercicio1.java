/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author fredy
 * EJERCICIO 1: Elabore una aplicación de consola Java que permita determinar el peso ideal
 * de un niño o niña utilizando la siguiente fórmula: edad * 2 + 8
 * Muestre en pantalla el resultado.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Paso 1: Solicitamos al usuario la edad del niño/a
        System.out.print("Ingrese edad : ");
        
 
        // Paso 2: Utilizamos la clase Scanner para obtener datos ingresados.
        Scanner objetoEntrada = new Scanner(System.in);
        
        // Paso 3: Capturamos la edad y la asignamos a una variable
        //Declaramos de la siguiente forma: [Tipo de dato] [nombre variable]
        int edad = objetoEntrada.nextInt();
        
        /* Paso 4: Efectuamos la operación de cómputo
         utilizando la fórmula del ejercicio. Para
         esto declaramos una variable que almacene
         el peso ideal */
        int pesoIdeal = edad * 2 + 8;
        
        /* Paso 5: Mostramos el resultado*/
        System.out.println("El peso ideal es "+ pesoIdeal);
        
        
        
    }
    
}
