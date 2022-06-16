/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author a18oc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese su cadena de caracteres");
        String cadena = scaner.nextLine();
        char [] cadena2 = cadena.toCharArray();
        int contador = 0;
        for(int i = 0; i<cadena2.length; i++){
            if(Character.isDigit(cadena2[i])){
                contador++;
            }
        }
        System.out.println("Total de numeros: " + contador);
    }
    
}
