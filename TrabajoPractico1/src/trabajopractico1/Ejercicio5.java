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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        int numero1 = input.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int numero2 = input.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = Double.NaN;
        
        if (numero2 != 0) {
            division = (double) numero1 / numero2;
        }
        else {
            System.out.println("No se puede dividir por cero");
        }
        
        System.out.println("Resultados");
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
        
        input.close();
    }
}
