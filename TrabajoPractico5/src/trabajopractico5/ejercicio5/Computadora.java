package trabajopractico5.ejercicio5;

public class Computadora {
    String marca, numeroSerie;
    PlacaMadre placa;
    Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, String modelo, String chipset){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Propietario getPropietario(){return propietario;}
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario; 
        
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);}
    }
    @Override
    public String toString(){return marca+" SN:"+numeroSerie+" "+placa;} 
}