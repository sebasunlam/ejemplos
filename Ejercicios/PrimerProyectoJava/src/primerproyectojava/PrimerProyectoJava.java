/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectojava;

import java.util.Scanner;

/**
 *
 * @author spardo
 */
public class PrimerProyectoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Integer tipo = 0,superficie = 0;        

        System.out.println("Ingrese 1 para triangulo y 0 para cuadrado");
        tipo = s.nextInt();

        switch (tipo) {
            case 0:
                
                superficie = Superficie("Eligio cuadrado");                
                System.out.println("Su superficie es " + superficie);
                break;
            case 1:
                
                superficie = Superficie("Eligio triangulo") / 2;
                
                System.out.println("Su superficie es " + superficie);
                break;
            default:
                System.err.println("Tipo no valido");
                break;
        }

        

    }
    
    private static Integer Superficie(String mensaje){
        Integer base = 0;
        Integer altura = 0;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un valor para base");
        base = s.nextInt();

        System.out.println("Ingrese un valor para altura");
        altura = s.nextInt();
        
        System.out.println(mensaje);
        
        return base * altura;
    }

}
