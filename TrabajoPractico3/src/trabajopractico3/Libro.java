package trabajopractico3;

/**
 *
 * @author Matias Mansilla
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return anioPublicacion; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAñoPublicacion(int año) {
        if (año >= 1450 && año <= 2025) { // Ejemplo de validación histórica
            this.anioPublicacion = año;
        } else {
            System.out.println("Año inválido. Debe estar entre 1450 y 2025.");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo +
                           "\nAutor: " + this.autor +
                           "\nAño de publicación: " + this.anioPublicacion);
    }
}

