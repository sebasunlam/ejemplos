/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miobjeto;

import java.util.Scanner;


/**
 *
 * @author Andres
 */
public class Miobjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

/*kjdsakjajdssa
        skjdaslk
        sjdas
        
        */        
       
        Persona miPersona = new Persona ();
        System.out.println("ingrese Nombre");
        Scanner s = new Scanner(System.in);
        String nombre=s.nextLine();
        miPersona.setNombre(nombre);
        System.out.println("el nombre ingresado a mi persona es "
                + miPersona.getNombre());
        System.out.println("Ingres dni ");
       Integer dni = s.nextInt();
        
       miPersona.setDni(dni);
        System.out.println("El dni de " 
                + miPersona.getNombre()+ " es " 
                + miPersona.getDni());
        
        
        
    }
    
}
