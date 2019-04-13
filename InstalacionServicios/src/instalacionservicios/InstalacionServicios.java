/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instalacionservicios;

import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class InstalacionServicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definición de los identidicadores a utilizar para los ingresos del usuario
        String usuario;
        String clave;
        int contadorIntento=0;
        String apellidoPaterno,apellidoMaterno,nombres,direccion;
        int rut,codigoComunaSeleccionada;
        boolean existeServicio = false;
        String nombreComunaSeleccionada="";
        
        //Definición de los arreglos 
        String nombreComunasDisponibles[] = {"Temuco","Padre las Casas"};
        int codigoComunasDisponibles[] = {451,452};

        String nombreServiciosDisponibles[] = {"Telefonía","Internet 10Mbps","Internet 30 Mbps","Televisión Satelital"};
        int codigoServiciosDisponibles[] = {701,702,703,704};
        
        int serviciosSeleccionados[] = new int[4];
        int cantidadServicios=0;
        
        int codigoServicioSeleccionado;
        String respuestaMasServicios ="";
        int codigoServicioBusqueda;
        
        //Solicitud de ingreso de usuario y clave
        
        Scanner entrada = new Scanner(System.in);
        do{
            if(contadorIntento>0){
                System.out.println("Usuario y clave incorrecta");
            }
            System.out.print("Ingrese usuario :");
            usuario = entrada.nextLine();
            
            System.out.print("Ingrese clave :");
            clave = entrada.nextLine();
            contadorIntento++;
            //Verificación si el usuario y clave es correcto.
        }while(!(usuario.equals("inst771") && clave.equals("asdf1234") || contadorIntento ==3));
        //En caso de que se haya superado el número de intentos
        if(contadorIntento==3){
            System.out.println("Ha superado el número máximo de intentos de ingreso.  Por motivos de seguridad su cuenta se ha bloqueado. Contáctese al 600 600 5000, opción 4 para obtener una nueva clave.”.  ");
       //En caso de que no haya superado el número de intentos, solicitamos los demás datos
        }else{
        
            System.out.println("Bienvenido al registro de instalaciones");
            System.out.println("*** Paso 1 de 3 : Ingrese datos del cliente ***");
            System.out.println("");
            //Datos personales
            System.out.print("    RUT               : ");
            rut = entrada.nextInt();
            entrada.nextLine();
            
            System.out.print("    Apellido Paterno  : ");
            apellidoPaterno = entrada.nextLine();
            
            System.out.print("    Apellido Materno  : ");
            apellidoMaterno = entrada.nextLine();
            
            System.out.print("    Nombres           : ");
            nombres = entrada.nextLine();
            System.out.println("*** Paso 2 de 3 : Ingrese dirección de instalación ***");
             System.out.println("");
            //Desplegamos las comunas contenidas en el arreglo
            System.out.println("Comuna de Instalación");
            for(int i=0;i<2;i++){
                System.out.println(codigoComunasDisponibles[i]+" "+nombreComunasDisponibles[i]);
            }
                //Solicitamos la comuna y se ejecuta el ciclo en caso de que la comuna no sea 451 o 452
                do{
                System.out.print("Digite Código Comuna  :");
                codigoComunaSeleccionada = entrada.nextInt();
                }while(!(codigoComunaSeleccionada == 451 || codigoComunaSeleccionada == 452));
                //Limpiamos Scanner
            entrada.nextLine();
            
            //Dirección
            System.out.print("    Dirección         : ");
            direccion = entrada.nextLine();
            //Servicios
            System.out.println("*** Paso 3 de 3 : Ingrese servicios ***");
            System.out.println("Servicios disponibles");
            System.out.println("");
                //Desplegamos los servicios disponibles, los cuales se encuentran en el arreglo
                for(int i=0;i < nombreServiciosDisponibles.length;i++){
                System.out.println(codigoServiciosDisponibles[i]+" "+nombreServiciosDisponibles[i]);
                }
                /*Iniciamos la solicitud del servicio requerido. 
                Ejecutamos este ciclo  si la cantidad de servicios es menor a 4 y si ingresa una s como respuesta.*/
                do{
                    //Solicitamos código de servicio y ejecutamos el ciclo en caso de que los códigos no sean 701,702,702 o 704
                    do{
                        System.out.print("Digite Código de servicio  :");
                        codigoServicioSeleccionado = entrada.nextInt();
                    }while(!(codigoServicioSeleccionado == 701 || codigoServicioSeleccionado == 702 || codigoServicioSeleccionado == 703|| codigoServicioSeleccionado == 704 ));
            
                    /*Cuando llegamos a este punto significa que el usuario incorporó un código correcto.
                    Aquí verificamos si el servicio está incluido o no en el arreglo de servicios seleccionados.*/
                    //Recorremos el arreglo de servicios seleccionados.
                    for(int i=0;i<4;i++){
                        //Si el servicio ingresado coincide con el servicio ya existente en el arreglo, enviamos un mensaje.
                        if(serviciosSeleccionados[i]==codigoServicioSeleccionado){
                            System.out.println("Servicio ya solicitado.");
                            //Cambiamos el valor al identificador en caso de que el servicio ya exista
                            existeServicio = true;
                        }
                    }
                        /*Despues de recorrer el arreglo de servicios en caso de que el servicio que se pide
                                no se encuentre allí, lo incorporamos. La posición donde lo incorporamos
                                        depende del identificador cantidadServicios (Parte en 0 y lo vamos aumentando)*/
                        if(existeServicio == false){
                                serviciosSeleccionados[cantidadServicios]=codigoServicioSeleccionado;
                                cantidadServicios++;
                                System.out.println("Servicio agregado correctamente.");
                        }
                        //Si no llegamos aún al máximo de servicios, consultamos si desea agregar otro.
                        if(cantidadServicios < 4){
                            System.out.println("¿Agregar mas servicios? s/n");
                            //Limpiamos Scanner
                            entrada.nextLine();
                            //Capturamos la respuesta
                            respuestaMasServicios = entrada.nextLine();
                            //Nuevamente dejamos la variable en falso para cambiarla a verdadero cuando se repita un servicio.
                            existeServicio=false;
                        }else{
                            //En caso de que hayamos alcanzado el máximo de servicios.
                            System.out.println("Ya agregó todos los servicios");        
                        }
                        //Repetimos mientras ingrese una s y la cantidad de servicios sea menor a 4
               }while(respuestaMasServicios.equals("s") && cantidadServicios <4);
            
            //Buscamos nombre de comuna para mostrar en la salida.
            for(int i=0;i<2;i++){
                if(codigoComunasDisponibles[i] == codigoComunaSeleccionada){
                    nombreComunaSeleccionada = nombreComunasDisponibles[i];
                }
            }
            System.out.println("** Registro de Instalación **");
            System.out.println("RUT                     :" + rut);
            System.out.println("NOMBRES                 :" + nombres);
            System.out.println("APELLIDOS               :" + apellidoPaterno + " "+ apellidoMaterno);
            System.out.println("DIRECCION               :" + direccion);
            System.out.println("COMUNA                  :" + codigoComunaSeleccionada +" "+ nombreComunaSeleccionada);
            System.out.println("");
            System.out.println("** Servicios Solicitados**");
            /*Recorremos el arreglo de servicios solicitados por el usuario. Para mostrar el nombre del servicio recorremos nuevamente
            el arreglo de servicios disponibles.*/
            for(int i=0;i<4;i++){
                codigoServicioBusqueda = serviciosSeleccionados[i];
                for(int j=0;j<4;j++){
                    if(codigoServiciosDisponibles[j] == codigoServicioBusqueda){
                        System.out.println(codigoServicioBusqueda +" "+nombreServiciosDisponibles[j]);
                    }
                }
            }
            System.out.println("El ingreso de la instalación se ha efectuado correctamente. Su sesión ha finalizado.");
            
        
        }
        
    }
    
}
