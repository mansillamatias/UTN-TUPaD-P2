package trabajopractico5.ejercicio1;

public class Foto {
    private String imagen;
    private String formato;

    public Foto() {
    }

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return this.imagen;
    }

    public String getFormato() {
        return formato;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
}