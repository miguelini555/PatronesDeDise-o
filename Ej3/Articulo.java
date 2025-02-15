public class Articulo implements Interactuable {
    private String titulo;

    public Articulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en el artículo: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción al artículo: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Artículo compartido: " + titulo);
    }
    
    @Override
    public String toString() {
        return "Artículo: " + titulo;
    }
}
