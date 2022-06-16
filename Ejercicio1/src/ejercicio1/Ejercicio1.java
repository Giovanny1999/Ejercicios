package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
      
        try {
           
            String fechaIngreso1 = "45/13/2002";
             String fechaIngreso2 = "03/02/2001";
              String fechaIngreso3 = "01/20/2010";
               String fechaIngreso4 = "02-04-2010";
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso1);
            String fechaSalida = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
            System.out.println("Fecha Ingresada: " + fechaIngreso1 );
             System.out.println((fechaIngreso1.equals(fechaSalida)) ?  "Fecha Correcta\n" : "Fecha Incorrecta, los numeros de dia, mes o anio son incorrectos.\n");
            Date fecha2 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso2);
            String fechaSalida2 = new SimpleDateFormat("dd/MM/yyyy").format(fecha2);
             System.out.println("Fecha Ingresada: " + fechaIngreso2 );
             System.out.println((fechaIngreso2.equals(fechaSalida2)) ?  "Fecha Correcta\n" : "Fecha Incorrecta, los numeros de dia, mes o anio son incorrectos.\n");
            Date fecha3 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso3);
            String fechaSalida3 = new SimpleDateFormat("dd/MM/yyyy").format(fecha3);
             System.out.println("Fecha Ingresada: " + fechaIngreso3 );
             System.out.println((fechaIngreso3.equals(fechaSalida3)) ?  "Fecha Correcta\n" : "Fecha Incorrecta, los numeros de dia, mes o anio son incorrectos.\n");
            Date fecha4 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso4);
            String fechaSalida4 = new SimpleDateFormat("dd/MM/yyyy").format(fecha4);
            System.out.println("Fecha Ingresada: " + fechaIngreso4 );
             System.out.println((fechaIngreso4.equals(fechaSalida4)) ?  "Fecha Correcta\n" : "Fecha Incorrecta, los numeros de dia, mes o anio son incorrectos.\n");
        } catch (Exception e) {
            System.out.println("el formato de alguna fecha es incorrecto, no se aceptan - solo /\n");
        }

    }

}
