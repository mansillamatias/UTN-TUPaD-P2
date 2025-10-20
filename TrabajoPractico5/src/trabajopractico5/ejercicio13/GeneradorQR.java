package trabajopractico5.ejercicio13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // Se crea pero no se guarda
        System.out.println("QR generado: " + codigo.getValor() +
            " para " + codigo.getUsuario().getNombre());
    }
}