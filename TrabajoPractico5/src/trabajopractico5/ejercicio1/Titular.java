package trabajopractico5.ejercicio1;

import trabajopractico5.ejercicio1.Pasaporte;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public boolean tienePasaporte() {
        return pasaporte != null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public void mostrarPasaporte() {
        if (pasaporte != null) {
            System.out.println(nombre + " tiene pasaporte con número: "+ pasaporte.getNumero());
        } else {
            System.out.println(nombre + " no tiene pasaporte.");        
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}