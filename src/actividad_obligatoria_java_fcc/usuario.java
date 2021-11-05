/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_obligatoria_java_fcc;

/**
 *
 * @author Fer
 */
public class usuario {
    //Atributos (Propiedades):
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editor_fav;
    private String sist_op;
    
    public usuario(String n, String a, int e, String h, String ef, String so){
        //Constructor completo:
        nombre = n;
        apellido = a;
        edad = e;
        hobbie = h;
        editor_fav = ef;
        sist_op = so;
    }
    public usuario(){
        //Constructor Vacio
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setApellido(String a){
        apellido = a;
    }
    public void setEdad(int e){
        edad = e;
    }
    public void setHobbie(String h){
        hobbie = h;
    }
    public void setEditor(String ef){
        editor_fav = ef;
    }
    public void setSO(String so){
        sist_op = so;
    }   
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getHobbie(){
        return hobbie;
    }
    public String getEditor(){
        return editor_fav;
    }
    public String getSO(){
        return sist_op;
    }   
//    public mostrar_consola(){
//        System.out.println("Los datos ingresados son:");
//        System.out.println("Nombre: "nombre");
//        System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");
//        System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");
//        System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");
//        System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");
//        System.out.println("Los datos ingresados son:\nNombre: "nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nHobbie: "+hobbie+"\nEditor de Codigo Preferido: "+editor_fav+"\nSistema Operativo que usa: "+sist_op"");
//        
//    }
}
