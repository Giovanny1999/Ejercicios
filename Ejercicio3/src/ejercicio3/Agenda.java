/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author a18oc
 */


import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Agenda {
     private ArrayList<Lista> lista;
     public Agenda(){
         lista = new ArrayList<>();
     }
     public void agregar(int id, String Nombre, String apellido1, String apellido2, String fecha){
        Lista l = new Lista(id,Nombre, apellido1, apellido2, fecha);
        lista.add(l);
    }
    public void verEdad(int id){
        Date fechaNac = null;
        for(int i = 0; i<lista.size(); i++){
            if(id == lista.get(i).getId())
            {
                System.out.println("Persona: " + lista.get(i).getId()+" " + lista.get(i).getNombre() +" " + lista.get(i).getApellidop()
                    + " " + lista.get(i).getApellidoM() + " " + lista.get(i).getFecha());
               try{
                   fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(lista.get(i).getFecha());
               }catch(ParseException e){
                   System.out.println(e);
               }
               Calendar fechaNacimiento = Calendar.getInstance();
               Calendar actual = Calendar.getInstance();
               fechaNacimiento.setTime(fechaNac);
               int año = actual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
               int mes = actual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
               int dia = actual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
               if(mes<0|| (mes == 0 && dia<0)){
                año--;
            }
               System.out.println("Edad: " + año);
            }
           
        }
    }
    public void obtenerLista(){
        Date fechaNac = null;
        for(int i = 0; i<lista.size(); i++){
            
               
               try{
                   fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(lista.get(i).getFecha());
               }catch(ParseException e){
                   System.out.println(e);
               }
               Calendar fechaNacimiento = Calendar.getInstance();
               Calendar actual = Calendar.getInstance();
               fechaNacimiento.setTime(fechaNac);
               int año = actual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
               int mes = actual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
               int dia = actual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
               if(mes<0|| (mes == 0 && dia<0)){
                año--;
            }
               
               
               System.out.println("idEmpleado " + lista.get(i).getId() + " Nombre: " + lista.get(i).getNombre() + 
                       lista.get(i).getApellidop() + lista.get(i).getApellidoM() + " Edad: " + año);
            
           
        }
    }
}

