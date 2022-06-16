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
public class Lista {
     public Lista(){
         
     }
     public Lista(int id, String nombre,String appelidop, String appelidom, String fecha){
         this.id = id;
         this.nombre= nombre;
         this.apellidop = appelidop;
         this.apellidoM = appelidom;
         this.fecha = fecha;
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    int id = 0;
   String nombre = ""; 

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   String apellidop = "";   
   String apellidoM = ""; 
   String fecha = ""; 
   
}
