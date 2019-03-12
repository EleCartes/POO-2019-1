/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author fredy
 * Elabore un programa que capture la edad de un niño o niña
 * y muestre el peso ideal que corresponda usando la fórmula
 * edad*2+8.
 * Repita este procedimiento 5 veces.
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos variables
        int i,edad,pesoIdeal;
        
        //Declaramos la estrutura de repetición FOR
        for(i=0;i<5;i++){
            System.out.print("Ingrese edad del niño/a "+(i+1)+" : ");
            Scanner objetoEntrada   = new Scanner(System.in);
            edad                    = objetoEntrada.nextInt();
            pesoIdeal               = edad*2+8;
            System.out.println("Peso ideal es "+pesoIdeal);
            
            
        }
    }
    
}
