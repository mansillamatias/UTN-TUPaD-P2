package trabajopractico5.ejercicio4;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Banco b = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("1111-2222-3333-4444", "12/28", b);
        Cliente c = new Cliente("Pedro Gómez", "22333444");
        t.setCliente(c);
        System.out.println(t);
        System.out.println(c);
    }
}