package trabajopractico5.ejercicio10;

public class MainEjercicio10 {
    public static void main(String[] args) {
        Titular t = new Titular("Sofía Blanco","99887766");
        CuentaBancaria c = new CuentaBancaria("123000111000",250000,"XYZ123","2025-09-10");
        
        c.setTitular(t);
        
        System.out.println(c);
        System.out.println(t);
    }
}