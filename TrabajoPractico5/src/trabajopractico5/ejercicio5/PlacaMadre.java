package trabajopractico5.ejercicio5;

public class PlacaMadre {
    String modelo, chipset;

    public PlacaMadre() {
    }

    public PlacaMadre(String modelo, String chipset) { 
        this.modelo = modelo;
        this.chipset = chipset; 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
 
    @Override
    public String toString() { 
        return modelo + " (" + chipset + ")";
    } 
}