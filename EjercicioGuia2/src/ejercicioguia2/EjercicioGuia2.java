/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia2;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class EjercicioGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota,media,masBaja;
        int cantidad = 1;
        media=0;
        masBaja=8;
        Scanner entrada = new Scanner(System.in);
        while(cantidad <=3){
            System.out.println("Analizando al alumno "+cantidad);
            System.out.println("Ingrese calificación : ");
            nota = entrada.nextFloat();
            if(masBaja > nota){
                masBaja = nota;
            }
            media=media+nota;
            cantidad++;
        }
        media=media/3;
        System.out.println("La nota mas baja es "+ masBaja);
        System.out.println("La media es "+ media);
        
    }
    
}
