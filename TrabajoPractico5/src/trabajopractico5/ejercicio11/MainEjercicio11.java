package trabajopractico5.ejercicio11;

public class MainEjercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De Música Ligera", artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

    }
}