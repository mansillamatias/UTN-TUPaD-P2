package trabajopractico3;

/**
 *
 * @author Matias
 */
public class Principal {

    public static void main(String[] args) {
        /*--------------------------- Ejercicio 1 ----------------------------*/
        // Creamos el objeto estudiante
        Estudiante est1 = new Estudiante();
        
        // Cargamos datos al nuevo objeto estudiante
        est1.setNombre("Matias");
        est1.setApellido("Mansilla");
        est1.setCurso("Programación 2");
        est1.setCalificacion(8);
        
        System.out.println("------------------ Ejercicio 1 ------------------");
        
        // Mostramos info del estudiante
        System.out.println("Informacion del estudiante");
        est1.mostrarInfo();
        
        // Disminuimos calificacion
        est1.subirCalificacion(1.5);
        // Mostramos nueva calificacion
        
        System.out.println("\nSe subio la calificación de " + est1.getNombre() + " " + est1.getApellido());
        System.out.println("La nueva calificacion es: " + est1.getCalificacion());
        // Disminuimos calificacion
        est1.bajarCalificacion(2.3);
        System.out.println("\nSe bajo la calificación de " + est1.getNombre() + " " + est1.getApellido());
        System.out.println("La nueva calificacion es: " + est1.getCalificacion());

        
        // Mostramos informacion actualizada
        System.out.println("\nInformacion actualizada del estudiante");
        est1.mostrarInfo();
        
        /*--------------------------- Ejercicio 2 ----------------------------*/
        // Se crea el objeto Mascota
        Mascota perro = new Mascota();
        
        // Cargamos datos a la nueva mascota
        perro.setNombre("Micky");
        perro.setEspecie("Caniche");
        perro.setEdad(2);
        
        System.out.println("\n----------------- Ejercicio 2 -----------------");

        // Mostramos informacion de la mascota
        System.out.println("Informacion de la nueva mascota\n");
        perro.mostrarInfo();
        
        // Actualizamos edad
        perro.cumplirAnios();
        System.out.println("\n" + perro.getNombre() + " acaba de cumplir años y ahora tiene: " + perro.getEdad() + "años\n");
        
        
        // Mostramos informacion actualizada
        System.out.println("Esta es la nueva informacion de " + perro.getNombre());
        perro.mostrarInfo();
        
        /*--------------------------- Ejercicio 3 ----------------------------*/
        System.out.println("\n----------------- Ejercicio 3 -----------------");

        Libro miLibro = new Libro();
        miLibro.setTitulo("Harry Potter y las reliquias de la muerte");
        miLibro.setAutor("J. K. Rowling");
        
        System.out.println("Informacion del nuevo libro");
        miLibro.mostrarInfo();
        
        // Asignación atributos
        System.out.println("\nColocando un año de publicación invalido");
        miLibro.setAñoPublicacion(1300); // Año inválido
        System.out.println("\nColocando un año de publicación valido");
        miLibro.setAñoPublicacion(2007); // Año válido

        // Mostrar información final
        System.out.println("Año de publicación: " + miLibro.getAñoPublicacion());
        
        /*--------------------------- Ejercicio 4 ----------------------------*/
        System.out.println("\n----------------- Ejercicio 4 -----------------");
        
        // Creacion de dos gallinas
        Gallina g1 = new Gallina();
        g1.setIdGallina(1);
        g1.setEdad(1);
        g1.setHuevosPuestos(3);
        
        
        Gallina g2 = new Gallina();
        g2.setIdGallina(2);
        g2.setEdad(2);
        g2.setHuevosPuestos(5);
        
        //Mostrar estados iniciales
        System.out.println("Estados iniciales");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones
        // Gallina 1
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        
        // Gallina 2
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estado final
        System.out.println("\nEstados finales");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        /*--------------------------- Ejercicio  ----------------------------*/
        System.out.println("\n----------------- Ejercicio 5 -----------------");
        
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Andrómeda");
        nave.setCombustible(50);

        nave.despegar();
        nave.avanzar(30); // Intento sin recargar (requiere 60 unidades)
        nave.recargarCombustible(40); // Recarga válida
        nave.avanzar(30); // Ahora sí puede avanzar
        nave.mostrarEstado(); // Estado final
    }

    
    
    
}
