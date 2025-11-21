package trabajopractico8.parte1;

public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% descuento
    }
}
