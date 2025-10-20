package trabajopractico5.ejercicio2;

public class Bateria {
    private String modelo;
    private String capacidad;

    public Bateria() {
    }
    
    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }

}