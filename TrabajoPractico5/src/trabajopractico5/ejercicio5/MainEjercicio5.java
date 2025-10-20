package trabajopractico5.ejercicio5;

public class MainEjercicio5 {
    public static void main(String[] args) {
    Propietario p = new Propietario("Laura Díaz","33445566");
    Computadora compu = new Computadora("HP","ABC123","Asus Prime","Z790");
    
    compu.setPropietario(p);
    System.out.println(compu);
    System.out.println(p);
    }
}