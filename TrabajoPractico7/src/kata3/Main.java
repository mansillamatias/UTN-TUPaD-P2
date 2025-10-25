package kata3;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 50000),
            new EmpleadoTemporal("Luis", 120, 300)
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}