/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilealumnos;

import java.util.Scanner;

/**
 *
 * @author spardo
 */
public class WhileAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer aprobados = 0;
        Integer desaprobados = 0;
        Integer promocionados = 0;
        Integer ausentes = 0;

        Integer nota;

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Ingrese la nota");
            nota = s.nextInt();
            if (nota == 0) {
                ausentes++;
            } else if (nota > 0 && nota < 4) {
                desaprobados = desaprobados + 1;
            } else if (nota >= 4 && nota < 7) {
                aprobados++;
            } else {
                promocionados += 1;
            }
        } while (nota >= 0 && nota <= 10);

        System.out.print("Aprobados: " + aprobados);
        System.out.print(" Promocionados: " + promocionados);
        System.out.print(" Desaprobados: " + desaprobados);
        System.out.print(" Ausentes: " + ausentes);
    }

}
