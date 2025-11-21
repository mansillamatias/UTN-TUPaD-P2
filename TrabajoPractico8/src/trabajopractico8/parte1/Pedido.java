package trabajopractico8.parte1;

import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;

    public Pedido(List<Producto> productos) {
        this.productos = productos;
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        
        for (Producto producto : productos) {
            total = total + producto.getPrecio();
        }   
        return total;
    }
    
    public void notificarCambioEstado(Notificable cliente, String estado) {
        cliente.notificar("El pedido cambió de estado: " + estado);
    }

}
