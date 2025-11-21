package trabajopractico8.parte1;

public class PayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal: $" + monto);
    }
}
