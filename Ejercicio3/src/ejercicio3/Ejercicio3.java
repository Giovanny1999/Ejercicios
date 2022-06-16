/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a18oc
 */

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args){
          System.out.println("1. Registrar Empleado");
           System.out.println("2. Buscar Empleado");
           System.out.println("3. Obtener lista");
               System.out.println("4.Salir");
           System.out.println("Ingrese un numero");
        Scanner s = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        Scanner nombre = new Scanner(System.in);
        Scanner apellidop = new Scanner(System.in);
        Scanner apellidom = new Scanner(System.in);
        Scanner fecha = new Scanner(System.in);
        Scanner buscar = new Scanner(System.in);
        int valor = 0;
       
        Agenda a = new Agenda();
       
           valor = s.nextInt();
           
           switch(valor){
               case 1:
                   System.out.println("Ingrese id");
                   int idEmpleado = s.nextInt();
                   System.out.println("Ingrese Nombre");
                   String nombreEmpleado = nombre.nextLine();
                   System.out.println("Ingrese Apellido Paterno");
                   String apellidoPaterno = apellidop.nextLine();
                    System.out.println("Ingrese Apellido Materno");
                   String apellidoMaterno = apellidom.nextLine();
                    System.out.println("Ingrese Fecha de nacimiento");
                   String fechaN = fecha.nextLine();
                   a.agregar(idEmpleado, nombreEmpleado,apellidoPaterno,apellidoMaterno,fechaN );
                   System.out.println("Registrado\n");
                   break;
               case 2:
                   int idBuscar = buscar.nextInt();
                   a.verEdad(idBuscar);
                   break;
               case 3:
                   a.obtenerLista();
                   break;
           }
       while(valor!=4){
           System.out.println("1. Registrar Empleado");
           System.out.println("2. Obtener edad mediante id");
           System.out.println("3. Obtener lista");
           System.out.println("4. Sair");
           System.out.println("Ingrese un numero");
           valor = s.nextInt();
           
           switch(valor){
               case 1:
                   System.out.println("Ingrese id");
                   int idEmpleado = s.nextInt();
                   System.out.println("Ingrese Nombre");
                   String nombreEmpleado = nombre.nextLine();
                   System.out.println("Ingrese Apellido Paterno");
                   String apellidoPaterno = apellidop.nextLine();
                    System.out.println("Ingrese Apellido Materno");
                   String apellidoMaterno = apellidom.nextLine();
                    System.out.println("Ingrese Fecha de nacimiento");
                   String fechaN = fecha.nextLine();
                   a.agregar(idEmpleado, nombreEmpleado,apellidoPaterno,apellidoMaterno,fechaN );
                   System.out.println("Registrado\n");
                   break;
               case 2:
                   System.out.println("Ingrese ID a buscar");
                   int idBuscar = buscar.nextInt();
                   a.verEdad(idBuscar);
                   break;
                   
               case 3:
                   a.obtenerLista();
                   break;
                   
               
           }
       }
       
     
    }   
}

