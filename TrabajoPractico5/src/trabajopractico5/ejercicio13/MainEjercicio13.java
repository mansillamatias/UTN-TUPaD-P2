package trabajopractico5.ejercicio13;

public class MainEjercicio13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Torres", "ana.torres@email.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR123456", usuario);
    }
 
}