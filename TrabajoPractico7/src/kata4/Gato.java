package kata4;

class Gato extends Animal {
    public Gato() {
        super("Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}