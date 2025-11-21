package trabajopractico8.parte1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
    // 1. Crear producto
    Producto p1 = new Producto("Laptop", 1200.0);
    Producto p2 = new Producto("Mouse", 25.0);
    Producto p3 = new Producto("Teclado", 45.0);

    // 2. Crear pedido con lista de productos
    List<Producto> listaProductos = Arrays.asList(p1, p2, p3);
    Pedido pedido = new Pedido(listaProductos);

    // 3. Calcular total del pedido
    double totalPedido = pedido.calcularTotal();
    System.out.println("Total del pedido: $" + totalPedido);

    // 4. Cliente que será notificado
    Cliente cliente = new Cliente("Matías");
    pedido.notificarCambioEstado(cliente, "Pedido creado");

    // 5. Pago con tarjeta de crédito con descuento
    PagoConDescuento tarjeta = new TarjetaCredito();
    double montoConDescuento = tarjeta.aplicarDescuento(totalPedido);
    tarjeta.procesarPago(montoConDescuento);

    // 6. Pago con PayPal sin descuento
    Pago paypal = new PayPal();
    paypal.procesarPago(totalPedido);

    // 7. Notificación de cambio de estado
    pedido.notificarCambioEstado(cliente, "Pedido pagado");
        
    }
}
