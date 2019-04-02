/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos5;

/**
 *
 * @author fredy
 */
public class Arreglos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un arreglo de tamaño 5x4
        double numeros[][] = new double[5][4];
        //Declaramos un acumulador para la suma a nivel de fila
        double sumaFila     = 0;
        double sumaColumna  = 0;

        //Incorporamos valores al arreglo de manera aleatoria
        for(int i = 0;i<5;i++){
            for(int j=0;j<4;j++){
                numeros[i][j]= Math.floor(Math.random() * 100);
            }
        }
        //Mostramos los valores del arreglo generado
        for(int i=0;i <5 ; i++){
            for(int j=0;j<4;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //Mostramos la suma a nivel de filas
        for(int i=0;i <5 ; i++){
            for(int j=0;j<4;j++){
                //Acumulamos los valores de la fila
                sumaFila = sumaFila + numeros[i][j];
            } 
            System.out.println("Suma Fila = " + sumaFila);
            sumaFila = 0;
        }
        //Mostramos la suma a nivel de columnas
        for(int i = 0 ; i < 4 ; i++){
            for(int j=0;j<5;j++){
                //System.out.print(j +","+i+" ");
                sumaColumna = sumaColumna + numeros[j][i];
            }
            System.out.println("Suma Columna = " + sumaColumna);
            sumaColumna = 0;
        }
        //Muestre una serie de valores asociados al arreglo
        
        //a) Valor mínimo del arreglo
        
        //b) Valor más alto del arreglo
        
        //c) Promedio de todos los valores
        
        //d) Cantidad de números pares
        
        //e) Cantidad de números impares
        
    }
    
}
