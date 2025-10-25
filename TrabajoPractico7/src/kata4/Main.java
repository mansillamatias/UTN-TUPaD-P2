package kata4;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}