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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = input.nextInt();
        
        if (num1 > num2){
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            }
            else{
                System.out.println("El mayor es: " + num3);
            }
        }
        else if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: "+ num3);
        }
        
    }
}
