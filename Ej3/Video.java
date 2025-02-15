public class Video implements Interactuable {
    private String titulo;

    public Video(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en el video: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción al video: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Video compartido: " + titulo);
    }
    
    @Override
    public String toString() {
        return "Video: " + titulo;
    }
}

