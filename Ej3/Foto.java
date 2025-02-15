public class Foto implements Interactuable {
    private String descripcion;

    public Foto(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario en la foto: " + comentario);
    }

    @Override
    public void reaccionar(String tipoReaccion) {
        System.out.println("Reacción a la foto: " + tipoReaccion);
    }

    @Override
    public void compartir() {
        System.out.println("Foto compartida: " + descripcion);
    }
    
    @Override
    public String toString() {
        return "Foto: " + descripcion;
    }
}