package casopractico1;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear productos
        inventario.agregarProducto(new Producto("P001", "Leche", 800, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Notebook", 2500, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 1500, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Silla", 3200, 15, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Auriculares", 1200, 25, CategoriaProducto.ELECTRONICA));

        // 2. Listar productos
        System.out.println("📋 Todos los productos:");
        inventario.listarProductos();

        // 3. Buscar por ID
        System.out.println("🔍 Buscar producto P003:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("📂 Productos de ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar producto
        System.out.println("🗑️ Eliminando producto P001...");
        inventario.eliminarProducto("P001");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("🔄 Actualizando stock de P002 a 20...");
        inventario.actualizarStock("P002", 20);

        // 7. Total de stock
        System.out.println("📦 Total de stock: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("🏆 Producto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("💰 Productos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Categorías disponibles
        System.out.println("📚 Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}