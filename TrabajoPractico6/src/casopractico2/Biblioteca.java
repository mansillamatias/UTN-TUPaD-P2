package casopractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        libros.removeIf(libro -> libro.getIsbn().equalsIgnoreCase(isbn));
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles() {
        Set<String> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (autoresUnicos.add(autor.getId())) {
                autor.mostrarInfo();
                System.out.println("---------------------------");
            }
        }
    }
}