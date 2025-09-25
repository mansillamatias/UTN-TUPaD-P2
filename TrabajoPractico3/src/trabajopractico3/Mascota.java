package trabajopractico3;

/**
 *
 * @author Matias Mansilla
 */
public class Mascota {
    private String nombre, especie;
    private int edad;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
    
 
    
    public int getEdad() {
        return edad;
    }
        
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre +
                "\nEspecie: "+ this.especie +
                "\nEdad: "+ this.edad);
    }
    
    public int cumplirAnios() {
        return edad += 1;
    }
}
