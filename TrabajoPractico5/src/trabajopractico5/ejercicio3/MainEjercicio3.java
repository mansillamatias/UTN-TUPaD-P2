package trabajopractico5.ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Editorial Sur", "Av. Córdoba 1234");
        Libro libro = new Libro("Ficciones", "ISBN-987654321", autor, editorial);

        System.out.println("\nLibro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }

}