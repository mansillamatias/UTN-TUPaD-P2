package trabajopractico4;

/**
 *
 * @author Matias Mansilla
 */
public class Principal {
    public static void main(String[] args) {
        // Instanciación con constructor completo
        Empleado emp1 = new Empleado(101, "Ana Torres", "Gerente", 85000.0);
        Empleado emp2 = new Empleado(102, "Luis Gómez", "Analista", 62000.0);

        // Instanciación con constructor parcial
        Empleado emp3 = new Empleado("María López", "Diseñadora");
        Empleado emp4 = new Empleado("Carlos Pérez", "Programador");

        // Aplicación de métodos sobrecargados
        emp1.actualizarSalario(10);      // Aumento del 10%
        emp2.actualizarSalario(5000);    // Aumento fijo de $5000
        emp3.actualizarSalario(15);      // Aumento del 15%
        emp4.actualizarSalario(3000);    // Aumento fijo de $3000

        // Impresión de información
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
