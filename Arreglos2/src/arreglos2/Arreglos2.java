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
        // Variables globales
        int suma =0;
        double promedio;
        int edadBaja;
        int edadAlta;
        int indiceMayor =0;
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
            System.out.print("Ingrese nombre persona " + (i+1)+" : ");
            Scanner entradaNombres = new Scanner(System.in);
            //Capturamos el nombre
            nombre       = entradaNombres.nextLine();
            //Incorporamos el valor al arreglo de nombres
            nombres[i]   = nombre;
            

            //Solicitamos al usuario que ingrese edad
            System.out.print("Ingrese edad de persona "+ (i+1)+" :" );
            //Capturamos la edad
            edad         = entrada.nextInt();
            //incorporamos el valor al arreglo de edades
            edades[i]    = edad;      
            
        }
        // La edad promedio
        for(int i=0; i < cantidad ;i++){
            //Sumamos los valores del arreglo
            suma = suma + edades[i];
        }
        //Desplegamos el promedio
        promedio = suma / cantidad;
        System.out.println("Promedio : "+ promedio);
        

        //La edad más baja
        edadBaja = edades[0];
        for(int i=0; i < cantidad ;i++){
            //Comparamos para determinar si hay otra edad mas baja
            if(edadBaja > edades[i]){
                edadBaja = edades[i];
            }
        }
        //Mostramos los resultados con la edad mas baja
        System.out.println("La edad más baja es "+ edadBaja);
        
        //Determinar el nombre del mayor
        edadAlta = edades[0];
        for(int i =0;i<cantidad;i++){
            //Determinamos la edad mayor
            if(edadAlta < edades[i]){
                edadAlta = edades[i];
                indiceMayor = i;
            }     
        }
        //Desplegamos el nombre del mayor
        System.out.println("Nombre del mayor es " + nombres[indiceMayor]);
        
        
        
    }
    
}
