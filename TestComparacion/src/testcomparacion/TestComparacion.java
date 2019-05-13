/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcomparacion;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class TestComparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese número 1 :");
        num1 = entrada.nextInt();
        System.out.print("Ingrese número 2 :");
        num2 = entrada.nextInt();
        System.out.print("Ingrese número 3 :");
        num3 = entrada.nextInt();
        
        if(num1>num2){
            if(num1>num3){
                System.out.println("El mayor es "+num1);
            }else{
                System.out.println("El mayor es "+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("El mayor es "+num2);
            }else{
                System.out.println("El mayor es "+num3);
            }
        }
        System.out.println("Programa finalizado.");
        
    }
    
}
