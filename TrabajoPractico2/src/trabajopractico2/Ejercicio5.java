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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número (0 para terminar): ");
        int num = input.nextInt();
        int sum = 0;
        
        while (num != 0) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
            
            System.out.print("Ingrese un número (0 para terminar): ");
            num = input.nextInt();
            
        }
        
        System.out.println("La suma de los números pares es: "+ sum);

    }
}
