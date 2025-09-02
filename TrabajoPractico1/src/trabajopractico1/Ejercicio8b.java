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
public class Ejercicio8b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = input.nextDouble();
        
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("Resultado (double): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        input.close();
    }
}
