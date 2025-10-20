package trabajopractico5.ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Matias", "12345678");
        Pasaporte pasaporte = new Pasaporte("A123456", "2025-01-01", "matias.jpg", "JPEG");

        pasaporte.setTitular(titular);
        titular.setPasaporte(pasaporte);
        
        System.out.println(pasaporte);
    }
}