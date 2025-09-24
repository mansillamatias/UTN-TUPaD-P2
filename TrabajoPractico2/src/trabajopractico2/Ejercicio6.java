/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            num = input.nextInt();
            
            if (num == 0) {
                ceros = ceros + 1;
            } else if (num > 0) {
                positivos = positivos + 1;
            } else {
                negativos = negativos + 1;
            }
        }
        
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
}
