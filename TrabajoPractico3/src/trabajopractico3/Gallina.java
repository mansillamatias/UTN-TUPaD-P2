package trabajopractico3;

/**
 *
 * @author Matias Mansilla
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    // Método para simular puesta de huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para simular envejecimiento
    public void envejecer() {
        edad++;
    }

    // Mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina + " - Edad: " + edad + " años - Huevos puestos: " + huevosPuestos);
    }
}
