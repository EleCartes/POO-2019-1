/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos2;

import java.util.Scanner;

/**
 *
 * @author fredy
 * Creamos 2 arreglos de tipo String e int para capturar
 * nombre y edad de diferentes personas.
 * El tamaño de los arreglos es dinámico ya que solicitamos
 * al usuario la cantidad de registros a ingresar.
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Solicitamos al usuario la cantidad de registros a ingresar
        System.out.print("Ingrese cantidad de registros a ingresar : ");
        //Creamos objeto de la clase Scanner para capturar
        Scanner entrada = new Scanner(System.in);
        
        //Creamos variable y asignamos lo que el usuario ingresa
        int cantidad = entrada.nextInt();
        //Creamos variables adicionales
        String nombre;
        int edad;
        //Creamos los arreglos
        String nombres[]    = new String[cantidad];
        int edades[]        = new int[cantidad];
        
        //Creamos estructura de repetición para capturar valores
        for(int i = 0 ; i < cantidad;i++){
            //Solicitamos al usuario que ingrese nombre
            System.out.print("Ingrese nombre persona " + i+1+" : ");
            Scanner entradaNombres = new Scanner(System.in);
            //Capturamos el nombre
            nombre       = entradaNombres.nextLine();
            //Incorporamos el valor al arreglo de nombres
            nombres[i]   = nombre;
            

            //Solicitamos al usuario que ingrese edad
            System.out.print("Ingrese edad de persona "+ i+1+" :" );
            //Capturamos la edad
            edad         = entrada.nextInt();
            //incorporamos el valor al arreglo de edades
            edades[i]    = edad;      
            
        }
        
        
    }
    
}
