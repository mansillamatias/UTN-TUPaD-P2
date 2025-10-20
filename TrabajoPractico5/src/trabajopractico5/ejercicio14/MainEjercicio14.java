package trabajopractico5.ejercicio14;

public class MainEjercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Institucional", 12);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }
}