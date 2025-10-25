package kata2;

public class Main {
   public static void main(String[] args) {
       
       Figura circulo = new Circulo("c1", 3.5);
       Figura rectangulo = new Rectangulo("r1", 4.5, 5);
       
       System.out.println(circulo.calcularArea());
       System.out.println(rectangulo.calcularArea());

    }
}