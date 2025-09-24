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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precio_base = input.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo 5 para 5%): ");
        double descuento = input.nextDouble();
        
        double impuesto_decimal = impuesto / 100;
        double descuento_decimal = descuento / 100;
        
        double precioFinal = calcularPrecioFinal(precio_base, impuesto_decimal, descuento_decimal);
        
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
}
