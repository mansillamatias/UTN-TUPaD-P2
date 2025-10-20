package trabajopractico5.ejercicio7;

public class Vehiculo {
    private String patente, modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    public Conductor getConductor() {
        return conductor;
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
}