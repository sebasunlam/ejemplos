/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclasepoo;

import ejemplosclasepoo.forms.MainForm;
import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author spardo
 */
public class EjemplosClasePoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("HOLA MUNDO!");
        
        System.out.println("Ingrese la altura");
        
        Scanner s  = new Scanner(System.in);
        Integer altura = s.nextInt();
        
        System.out.println("Ingrese la base");
        s  = new Scanner(System.in);
        
        Integer base = s.nextInt();
        
        
        System.out.println("Ingrese T para triangulo y C para cuadrado");
        s  = new Scanner(System.in);
        if(s.next().equals("T")){
        System.out.println((base * altura)/2);    
        }else{
        System.out.println((base * altura));        
        }
        
    }
    
}
