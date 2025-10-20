package trabajopractico5.ejercicio6;

public class MainEjercicio6 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana Torres","1122334455");
        Mesa m = new Mesa(5,4);
        Reserva r = new Reserva("2025-10-20","21:00",c,m);
        
        System.out.println(r);
    }
}
