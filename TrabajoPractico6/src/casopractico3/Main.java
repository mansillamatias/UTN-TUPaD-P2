package casopractico3;

public class Main {
    public static void main(String[] args) {
        // Crear universidad
        Universidad universidad = new Universidad("Universidad Nacional de Córdoba");

        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Ana Torres", "Matemática");
        Profesor prof2 = new Profesor("P002", "Luis Gómez", "Historia");
        Profesor prof3 = new Profesor("P003", "María López", "Informática");

        // Crear cursos
        Curso curso1 = new Curso("C101", "Álgebra");
        Curso curso2 = new Curso("C102", "Historia Antigua");
        Curso curso3 = new Curso("C103", "Programación I");
        Curso curso4 = new Curso("C104", "Estadística");
        Curso curso5 = new Curso("C105", "Historia Moderna");

        // Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // Asignar profesores a cursos
        universidad.asignarProfesorACurso("C101", "P001");
        universidad.asignarProfesorACurso("C104", "P001");
        universidad.asignarProfesorACurso("C102", "P002");
        universidad.asignarProfesorACurso("C105", "P002");
        universidad.asignarProfesorACurso("C103", "P003");

        // Listar cursos con su profesor
        System.out.println("📚 Cursos con sus profesores:");
        universidad.listarCursos();

        // Listar profesores con sus cursos
        System.out.println("👨‍🏫 Profesores con sus cursos:");
        universidad.listarProfesores();

        // Cambiar el profesor de un curso
        System.out.println("🔄 Reasignando curso C104 a profesora P003...");
        universidad.asignarProfesorACurso("C104", "P003");

        // Confirmar sincronización
        System.out.println("📋 Verificación tras reasignación:");
        universidad.listarCursos();
        universidad.listarProfesores();

        // Eliminar un curso
        System.out.println("🗑️ Eliminando curso C105...");
        universidad.eliminarCurso("C105");

        // Confirmar que ya no aparece en la lista del profesor
        System.out.println("📋 Verificación tras eliminación de curso:");
        universidad.listarProfesores();

        // Eliminar un profesor
        System.out.println("🗑️ Eliminando profesor P002...");
        universidad.eliminarProfesor("P002");

        // Confirmar que los cursos quedan sin profesor
        System.out.println("📋 Verificación tras eliminación de profesor:");
        universidad.listarCursos();

        // Reporte de cantidad de cursos por profesor
        System.out.println("📊 Reporte de cursos por profesor:");
        universidad.reporteCursosPorProfesor();
    }
}