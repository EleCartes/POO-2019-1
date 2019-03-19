/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia1;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int cantidadPositivos   = 0;
        int cantidadNegativos   = 0;
        int cantidadNeutro     = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i=1;i<=20;i++){
            System.out.print("Ingrese número :");
            numero = entrada.nextInt();
            if(numero==0){
                cantidadNeutro++;
            }else{
                if(numero>0){
                    cantidadPositivos++;
                }else{
                    cantidadNegativos++;
                }
            }
        }
        System.out.println("Neutros     :" + cantidadNeutro);
        System.out.println("Positivos   :" + cantidadPositivos);
        System.out.println("Negativos   :" + cantidadNegativos);
        
        
    }
    
}
