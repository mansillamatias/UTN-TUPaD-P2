package trabajopractico5.ejercicio6;

public class Cliente {
    String nombre, telefono;
    
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){return nombre+" ("+telefono+")";}
}
