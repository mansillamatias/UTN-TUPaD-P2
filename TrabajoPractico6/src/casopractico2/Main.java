package casopractico2;

public class Main {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor autor3 = new Autor("A003", "Gabriel García Márquez", "Colombia");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN004", "Cien años de soledad", 1967, autor3);
        biblioteca.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, autor3);

        // 4. Listar libros
        System.out.println("📚 Libros en la biblioteca:");
        biblioteca.listarLibros();

        // 5. Buscar por ISBN
        System.out.println("🔍 Buscar libro ISBN003:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar por año
        System.out.println("📅 Libros publicados en 1981:");
        biblioteca.filtrarLibrosPorAnio(1981);

        // 7. Eliminar libro
        System.out.println("🗑️ Eliminando libro ISBN001...");
        biblioteca.eliminarLibro("ISBN001");
        biblioteca.listarLibros();

        // 8. Cantidad total
        System.out.println("📦 Total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Autores disponibles
        System.out.println("👨‍🏫 Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}