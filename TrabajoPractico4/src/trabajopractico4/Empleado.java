package trabajopractico4;

/**
 *
 * @author Matias Mansilla
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados;
    
    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor parcial con id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // id automático basado en contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; // salario por defecto
    }
    
    // Método sobrecargado: aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }
    
    // Método sobrecargado: aumento por monto fijo
    public void actualizarSalario(int montoFijo) {
        if (montoFijo > 0) {
            this.salario += montoFijo;
        }
    }
    
    // Método toString para mostrar información legible
    @Override
    public String toString() {
        return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + "]";
    }
    
    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}
