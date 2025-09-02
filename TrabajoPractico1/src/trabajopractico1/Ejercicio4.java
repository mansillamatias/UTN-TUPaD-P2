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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        input.close();
              
    }
}
