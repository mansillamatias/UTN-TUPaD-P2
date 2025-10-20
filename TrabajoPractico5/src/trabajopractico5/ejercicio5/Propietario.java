package trabajopractico5.ejercicio5;

public class Propietario {
    String nombre, dni;
    Computadora compu;

    public Propietario() {
    }

    public Propietario(String nombre, String dni){
        this.nombre = nombre; 
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setComputadora(Computadora compu){
        this.compu = compu; 
        
        if(compu != null && compu.getPropietario() != this) {
            compu.setPropietario(this);}
    }

    public Computadora getComputadora() {
        return compu;
    }
    
    @Override
    public String toString(){
        return nombre+" ("+dni+")";}
}