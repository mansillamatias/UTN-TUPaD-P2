/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ejercicio8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = input.nextInt();
        System.out.print("Ingrese el primer número entero: ");
        int numero2 = input.nextInt();
        
        if (numero2 != 0) {
            int resultado = numero1 / numero2;
            System.out.println("Resultado (int): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        input.close();
    }
}
