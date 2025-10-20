package trabajopractico5.ejercicio8;

public class MainEjercicio8 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Lucía Gómez","lucia@mail.com");
        Documento d = new Documento("Contrato","Contenido del contrato","A1B2C3","2025-10-18",u);
        System.out.println(d);
    }
}