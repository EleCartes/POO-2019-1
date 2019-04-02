/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos4;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Arreglos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = -5;
        int max = 5;
        System.out.println(Math.floor(Math.random()* (min-max)));
        //Declaramos el arreglo de tamaño 3x3
        int numeros[][] = new int[3][3];
        /*Declaramos una variable para capturas el número que ingresa
        el usuario para búsqueda  */
        int numeroBusqueda;
        //Declaramos un contador
        int contador =0;
        //Creamos un objeto de la clase Scanner para capturar valores
        Scanner entrada = new Scanner(System.in);
        
        //Construimos estructura de repetición para ingresar valores
        for(int i = 0;i <3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Ingrese número para índice " +i+","+j+" :");
                numeros[i][j] = entrada.nextInt();
            }
            System.out.println();
        }
        //Solicitamos al usuario el ingreso de un número para buscar los menores
        System.out.print("Ingrese un número para buscar los números menores : ");
        numeroBusqueda = entrada.nextInt();
        
        //Efectuamos un recorrido para buscar los números menores
        for(int i=0;i <3;i++){
            for(int j=0;j<3;j++){
                //Verificamos si el valor del arreglo en esta posición 
                //es menor al valor de búsqueda
                if(numeros[i][j] <numeroBusqueda){
                    System.out.println("Valor encontrado :" + numeros[i][j]);
                    //Aumentamos el contador
                    contador++;
                }
                
            }
        }
        //Mostramos la cantidad de coincidencias
        if(contador > 0){
            System.out.println("Se encontraron " + contador +" números menores a "+ numeroBusqueda);
        }else{
            System.out.println("No hay números menores a  "+ numeroBusqueda);
        }
        
    }
    
}
