package casopractico3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // quita del anterior
        }
        this.profesor = nuevoProfesor;
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this); // agrega al nuevo
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " [" + codigo + "]");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getId() + " - " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("---------------------------");
    }
}