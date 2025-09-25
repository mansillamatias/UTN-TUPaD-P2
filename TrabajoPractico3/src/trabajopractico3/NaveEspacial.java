package trabajopractico3;

/**
 *
 * @author Matias Mansilla
 */
public class NaveEspacial {
     private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // Ejemplo: 2 unidades por km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado: +" + cantidad);
        } else {
            System.out.println("No se puede superar el límite de " + LIMITE_COMBUSTIBLE + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
