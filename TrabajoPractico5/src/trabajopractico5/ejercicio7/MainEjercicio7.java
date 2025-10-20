package trabajopractico5.ejercicio7;

public class MainEjercicio7 {
    public static void main(String[] args) {
        Motor mot = new Motor("V8","M12345");
        Vehiculo v = new Vehiculo("AB123CD","Mustang",mot);
        Conductor c = new Conductor("Carlos Ruiz","LIC-9988");
        
        v.setConductor(c);
        
        System.out.println(v);
        System.out.println(c);
    }
}