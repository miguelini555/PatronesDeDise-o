public class Main {
    public static void main(String[] args) {
        System.out.println("----- Streaming -----");
        Pelicula pelicula = new Pelicula("Drive", 148);
        Serie serie = new Serie("Breaking Bad", 62);
        Documental documental = new Documental("Nuestro Planeta", "Naturaleza");
        
        Usuario usuario = new Usuario("Emanuel");
        usuario.agregarFavorito(pelicula);
        usuario.agregarFavorito(serie);
        usuario.agregarFavorito(documental);
        
        usuario.reproducirContenido(pelicula);
    }
}
