package trabajopractico5.ejercicio9;

public class MainEjercicio9 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Roberto Díaz","OSDE");
        Profesional pr = new Profesional("Dra. Méndez","Cardiología");
        CitaMedica c = new CitaMedica("2025-11-05","10:30",p,pr);
        
        System.out.println(c);
    }
}