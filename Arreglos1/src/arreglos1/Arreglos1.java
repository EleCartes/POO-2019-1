/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;

import java.util.Scanner;

/**
 *
 * @author fredy
 * Creamos un arreglo unidimensional de tamaño 5, capturamos
 * valores y posteriormente efectuamos diversos recorridos
 * para determinar número mayor o menor entre los ingresados.
 */
public class Arreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de un arreglo
        int numeros[] = new int[5];
        int numero;
        //Creamos un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        
        //1.- Creamos estructura FOR para incorporar valores
        for(int i=0;i < 5;i++){
            //Solicitar un valor al usuario
            System.out.print("Ingrese un número : ");
            //Capturamos el valor
            numero  = entrada.nextInt();
            //Asignamos el valor al arreglo numeros
            numeros[i] = numero;             
        }
        
        //2.- Creamos estructura FOR para recorrer el arreglo
        for(int i=0;i<5;i++){
            System.out.println("Indice "+i+" contiene "+ numeros[i]);
        }
        //3.- Creamos estructura FOR para mostrar pares
        for(int i=0;i<5;i++){
            if(numeros[i] % 2 ==0){
                System.out.println("Par encontrado "+ numeros[i]);
            }
            
        }
        
        int menor=numeros[0];
        for (int i = 0; i < 5; i++) {
            if (menor>numeros[i]) {
                menor=numeros[i];
            }
        }
        System.out.println("El numero menor es: "+menor);
        
        int mayor=numeros[0];
        for(int i =0;i<5;i++){
            if(mayor < numeros[i]){
                mayor= numeros[i];
            }
        }
         System.out.println("El numero mayor es: "+mayor);
    }
    
}
