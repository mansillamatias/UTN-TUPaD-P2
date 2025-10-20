package trabajopractico5.ejercicio14;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Se crea pero no se guarda
        System.out.println("Render exportado en formato " + render.getFormato() +
            " para proyecto " + render.getProyecto().getNombre());
    }

}