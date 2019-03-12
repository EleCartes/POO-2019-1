/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * Elabore un programa de consola que permita determinar el promedio de notas
     * según una cantidad de notas definida por el usuario.
     * 
     */
    public static void main(String[] args) {
        //Declaramos variables locales
        int cantidadNotas,nota;
        int suma = 0;
        //Solicitamos al usuario que ingrese la cantidad de notas
        System.out.print("Ingrese cantidad de notas : ");
        //Creamos objeto de la clase Scanner para capturar datos
        Scanner objetoEntrada   = new Scanner(System.in);
        //Capturamos el dato y asignamos a la variable cantidadNotas
        cantidadNotas           = objetoEntrada.nextInt();
        
        //Efectuamos la iteración con FOR utilizando la variable cantidadNotas.
        for(int i=0;i < cantidadNotas;i++){
            //Solicitar la nota
            System.out.print("Ingrese nota : ");
            //Crear objeto de clase Scanner para capturar
            Scanner entradaObjeto2  = new Scanner(System.in);
            //Capturamos la nota y la asignamos a una variable
            nota                    = entradaObjeto2.nextInt();
            //Sumamos la nota
            suma                    = suma + nota;
        }
        //Mostramos el promedio
        System.out.println("El promedio es "+ (suma/cantidadNotas));
        
    }
    
}
