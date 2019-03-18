/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * Ejercicio 4: Elabore un programa que efectúe la suma y promedio
     * de los números ingresados por el usuario mientras sean  números
     * mayores a 0.
     */
    public static void main(String[] args) {
        //Declaramos variables
        int suma=0;
        int contador=0;
        int numero,promedio;
       
        //Solicitamos al usuario el primer número
        Scanner objetoEntrada   = new Scanner(System.in);
        System.out.print("Ingrese número :");
        numero                  = objetoEntrada.nextInt();
        
        //Utilizamos estructura while para evaluar y repetir.
        while(numero > 0){
            //Utilizamos el acumular para sumar.
            suma = suma + numero; 
            //Aumentamos el contador de números válidos
            contador++;
            //Solicitamos un nuevo número
            Scanner objetoEntrada2  = new Scanner(System.in);
            System.out.print("Ingrese número :");
            numero                  = objetoEntrada2.nextInt();
            
        }
        promedio = suma / contador;
        //Mostramos resultados
        System.out.println("Suma        :"+suma);
        System.out.println("Promedio    :"+promedio);
        
    }
    
}
