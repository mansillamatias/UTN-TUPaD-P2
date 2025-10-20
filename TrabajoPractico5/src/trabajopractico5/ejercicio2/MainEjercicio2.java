package trabajopractico5.ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung", "4500mAh");
        Usuario usuario = new Usuario("Matias", "123456789");
        Celular celular = new Celular("049059883645309", "Samsung", "Galaxy S25", bateria);
    
        // Se establece la asociacion bidireccional entre celular y usuario
        celular.setUsuario(usuario);
        usuario.setCelular(celular);
        
        System.out.println(celular);
    }
}