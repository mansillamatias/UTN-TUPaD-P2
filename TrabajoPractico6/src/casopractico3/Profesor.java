package casopractico3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this); // sincroniza el otro lado
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (cursos.remove(curso)) {
            if (curso.getProfesor() == this) {
                curso.setProfesor(null); // rompe la relación
            }
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo() + " - " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + ")");
        System.out.println("ID: " + id);
        System.out.println("Cursos asignados: " + cursos.size());
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}