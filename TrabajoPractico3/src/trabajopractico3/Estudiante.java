package trabajopractico3;

/**
 *
 * @author Matias Mansilla
 */
public class Estudiante {

    private String nombre, apellido, curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion >= 0 ? calificacion : 0;
    }
    
    public void subirCalificacion(double puntos){
        this.calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        this.calificacion -= puntos;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre +
                "\nApellido: "+ this.apellido +
                "\nCurso: "+ this.curso +
                "\nCalificación: "+ this.calificacion);

    }
}
