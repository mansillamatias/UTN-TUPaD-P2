package trabajopractico5.ejercicio6;

public class Mesa {
    int numero, capacidad;
    
    public Mesa(int numero, int capacidad){
        this.numero = numero;
        this.capacidad = capacidad;}
    
    @Override
    public String toString(){
        return "Mesa "+numero+" ["+capacidad+" personas]";}
}
