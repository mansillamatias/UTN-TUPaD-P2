package trabajopractico5.ejercicio12;

public class MainEjercicio12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Laura Gómez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.0, contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
