package kata4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }

    public void describirAnimal() {
        System.out.println("Este es un " + nombre);
    }

}
