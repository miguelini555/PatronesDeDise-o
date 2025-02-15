public class Documental implements Reproducible {
    private String titulo;
    private String tema;

    public Documental(String titulo, String tema) {
        this.titulo = titulo;
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo documental: " + titulo + " sobre " + tema);
    }

    @Override
    public void pausar() {
        System.out.println("Documental pausado: " + titulo);
    }

    @Override
    public void detener() {
        System.out.println("Documental detenido: " + titulo);
    }

    @Override
    public String toString() {
        return "Documental: " + titulo + " (Tema: " + tema + ")";
    }
}