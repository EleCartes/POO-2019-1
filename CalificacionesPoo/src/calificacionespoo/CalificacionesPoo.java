/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionespoo;

import java.util.Scanner;
import modelo.NotaFinal;
import modelo.NotaParcial;

/**
 *
 * @author fredy
 */
public class CalificacionesPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*identificador para almacenar cuantas notas quiere ingresar el usuario. A la vez le 
        solicitamos al usuario que ingrese la cantidad.*/
        int cantidadNotas = solicitarCantidadNotas();
        /*Arreglo de objetos de la clase NotaParcial. Esto nos permite almacenar la
        nota, ponderacion y nota ponderada*/
        //Tamaño del arreglo según la cantidad de notas que indique el usuario
        NotaParcial notasParciales[] = new NotaParcial[cantidadNotas];
        //Creamos objeto de la clase NotaFinal
        NotaFinal notaFinal = new NotaFinal();
        
        /*Solicitamos las notas. Validamos en cada caso las entradas (nota de 10 a 70
        y ponderación de 1 a 100. Le enviamos el arreglo para que se ingresen las notas*/
        solicitarYAsignarDatos(notasParciales);
        /*Un método de la clase nota final, toma las notas parciales y determina la nota final.
        Para esto le enviamos el arreglo de notas parciales*/
        notaFinal.calcularNotaFinal(notasParciales);
        notaFinal.determinarEstado();
        //mostrarResultados
        mostrarResultados(notasParciales,notaFinal);
        
    }

    private static int solicitarCantidadNotas() {
        //Solicitamos y retornamos la cantidad de notas
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese cantidad de notas :");
            int cantidadNotas = entrada.nextInt();
            return cantidadNotas;
    }

    private static void solicitarYAsignarDatos(NotaParcial[] notasParciales) {
        //Creamos variables para almacenar la nota,ponderacion y la nota ponderada
        double notaParcial = 0  , ponderacion = 0,notaPonderada;
        //Creamos objeto notaParcialIngresada para almacenar los datos que correspondan a una nota.
        NotaParcial notaParcialIngresada;
        //Creamos objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        /*Efectuamos un ciclo for, para solicitar nota y ponderación.
        Teniendo estos datos incorporamos la nota ponderada al objeto de la clase NotaParcial*/
        //La cantidad de repeticiones está dada por el tamaño del arreglo indicado por el usuario. 
        for(int i=0;i< notasParciales.length;i++){
            
            /*PASO 1: Con una structura do while, validamos que la nota sea correcta, sino, la solicitamos
            nuevamente*/
            do{
                System.out.println("nota actual" + notaParcial);
                 System.out.print("Ingrese nota "+(i+1)+"   : ");
                 notaParcial = entrada.nextDouble();
            }while(notaParcial < 1.0 || notaParcial > 7.0); //Si la nota es menor a 1 o mayor a 7, se repite la solicitud y captura.
            //Dado que la nota es correcta, solicitamos ahora la ponderación.
             /*PASO 2: Con una structura do while, validamos que la ponderacion sea correcta, sino, la solicitamos
            nuevamente*/
            do{
                System.out.println("ponderacion" + ponderacion);
                 System.out.print("Ingrese ponderación      :");
                 ponderacion = entrada.nextDouble();
            }while(ponderacion < 1.0 || ponderacion > 100.0); //Si la ponderación es menor a 1 o mayor a 100, se repite la solicitud y captura
            
            //Instanciamos el objeto de la clase notaParcial
            notaParcialIngresada = new NotaParcial();
            //Agregamos los datos al objeto
            notaParcialIngresada.setNotaParcial(notaParcial);
            notaParcialIngresada.setPonderacion(ponderacion);
            /*Dado que el objeto tiene en sus propiedades la nota y ponderacion
            invocamos un método de esa clase que calcule la nota ponderada*/
            notaParcialIngresada.calcularNotaPonderada();
            
            //Agregamos la nota con sus propiedades (Nota, Ponderación y nota Ponderada) al arreglo de notas parciales.
            notasParciales[i]= notaParcialIngresada;
            //Fin del ciclo for
        }
    
    }

    private static void mostrarResultados(NotaParcial[] notasParciales,NotaFinal notaFinal) {
        //Mostramos todas las notas, el promedio ponderado y el estado
        for(int i =0;i < notasParciales.length;i++){
            System.out.println("Nota "+(i+1)+":"+ notasParciales[i].getNotaParcial() + " - Ponderación "+ notasParciales[i].getPonderacion()+" - Nota ponderada "+ notasParciales[i].getNotaPonderada());
        }
        
        System.out.println("Nota Final          :"+ notaFinal.getNotaFinal());
        System.out.println("Notas insuficientes :"+ notaFinal.getInsuficientes());
        System.out.println("Estado              :"+ notaFinal.getEstado());
    
    }

  
    
}
