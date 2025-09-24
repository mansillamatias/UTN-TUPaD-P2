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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        input.nextLine(); // Consumir el salto de linea
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = input.nextLine();
        categoria = categoria.toLowerCase();
        
        double descuento = 0;
        
        if (categoria.length() == 1) {
            switch (categoria) {
                case "a":
                    descuento = 0.10;
                    System.out.println("Descuento aplicado: 10%");
                    break;
                case "b":
                    descuento = 0.15;
                    System.out.println("Descuento aplicado: 15%");
                    break;
                case "c":
                    descuento = 0.20;
                    System.out.println("Descuento aplicado: 20%");
                    break;
                default:
                    System.out.println("La categoria no existe.");
                    break;
            }
        } else {
            System.out.println("Ingresa un caracter valido.");}
        
        double precio_final = precio - (precio * descuento);
        
        System.out.println("Precio final: " + precio_final);
    }
}
