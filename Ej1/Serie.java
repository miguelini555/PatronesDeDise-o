public class Serie implements Reproducible {
    private String titulo;
    private int episodios;

    public Serie(String titulo, int episodios) {
        this.titulo = titulo;
        this.episodios = episodios;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Serie pausada: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Serie detenida: " + titulo);
    }

    @Override
    public String toString() {
        return "Serie: " + titulo + " (" + episodios + " episodios)";
    }
}