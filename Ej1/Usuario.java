import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Reproducible> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public void agregarFavorito(Reproducible contenido) {
        favoritos.add(contenido);
        System.out.println(contenido + " agregado a favoritos");
    }

    public void reproducirContenido(Reproducible contenido) {
        contenido.reproducir();
    }
}