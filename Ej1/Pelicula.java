public class Pelicula implements Reproducible {
    private String titulo;
    private int duracion;

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo pelicula: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pelicula pausada: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Pelicula detenida: " + titulo);
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + " (" + duracion + " min)";
    }

}

