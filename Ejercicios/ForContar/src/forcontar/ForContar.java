/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forcontar;

import java.util.Scanner;

/**
 *
 * @author spardo
 */
public class ForContar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] temp = new Integer[4];
        Scanner s = new Scanner(System.in);

        for (Integer i = 0; i < 3; i++) {
            System.out.println("Ingrese Temperatura");
            temp[i] = s.nextInt();
        }

        for (Integer i = 0; i < 3; i++) {
            System.out.println("Temperatura en posicion " + i + " es " + temp[i]);
        }
    


    }

}
