/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumanumeros;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class SumaNumeros {

    
    public static void main(String[] args) {
     
        Integer operador1;
        Integer operador2;
        Integer resultado;
        System.out.println("Ingrese operador uno");
        Scanner o = new Scanner (System.in);
        
        operador1 = o.nextInt();
        
        
        System.out.println("Ingrese operador 2");
        
        o = new Scanner (System.in);
        operador2=o.nextInt();
        resultado= operador1+operador2;
        System.out.println("el resultado de sumar 2 numeros es "+ resultado);
        
        
        
        
        
        
        
// TODO code application logic here
    }
    
}
