/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_obligatoria_java_fcc;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Actividad_Obligatoria_JAVA_FCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	//Creo un objeto tipo Scanner llamado sc
        usuario user1 = new usuario();          //Creo objeto tipo usuario llamado user1
        
        System.out.println("Ingrese nombre: ");
        user1.setNombre(sc.nextLine());
        System.out.println("Ingrese apellido: ");
        user1.setApellido(sc.nextLine());
        System.out.println("Ingrese edad: ");
        user1.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese hobbie: ");
        user1.setHobbie(sc.nextLine());
        System.out.println("Ingrese editor de codigo favorito: ");
        user1.setEditor(sc.nextLine());
        System.out.println("Ingrese sistema operativo que utiliza: ");
        user1.setSO(sc.nextLine());
        
        System.out.println("--------------------------");
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: "+user1.getNombre());
        System.out.println("Apellido: "+user1.getApellido());
        System.out.println("Edad: "+user1.getEdad());
        System.out.println("Hobbie: "+user1.getHobbie());
        System.out.println("Editor de Código Preferido: "+user1.getEditor());
        System.out.println("Sistema Operativo que utiliza: "+user1.getSO());        
    }    
}
