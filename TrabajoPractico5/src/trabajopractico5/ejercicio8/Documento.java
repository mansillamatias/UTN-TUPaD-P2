package trabajopractico5.ejercicio8;

public class Documento {
    private String titulo, contenido;
    private FirmaDigital firma;

    public Documento() {
    }

    public Documento(String titulo, String contenido, String hash ,String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(hash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", firma=" + firma + '}';
    }
    
}