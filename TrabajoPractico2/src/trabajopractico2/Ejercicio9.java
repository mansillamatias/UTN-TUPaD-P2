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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        input.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        input.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.print("Ingrese la zona de envío (Nacional / Internacional): ");
        String zona = input.nextLine();
        
        double totalCompra = calcularTotalCompra(precio, calcularCostoEnvio(peso, zona));
        
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = -1;
        zona = zona.toLowerCase();
        switch (zona) {
            case "nacional":
                costoEnvio = peso * 5;
                break;
            case "internacional":
                costoEnvio = peso * 10;
                break;
            default:
                System.out.println("No se puede calcular el envio");
                break;
        }
        
        System.out.println("El costo de envio es: " + costoEnvio);
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double total_compra = precioProducto + costoEnvio;        
        return total_compra;
    }
}
