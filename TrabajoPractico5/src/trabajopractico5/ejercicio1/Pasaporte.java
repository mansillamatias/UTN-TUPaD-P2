package trabajopractico5.ejercicio1;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición 1:1
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Se crea internamente
    }
    
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // Bidireccionalidad
        }   
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
}