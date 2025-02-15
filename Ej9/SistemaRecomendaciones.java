import java.util.ArrayList;
import java.util.List;

public class SistemaRecomendaciones {
    private List<Recomendable> usuarios;

    public SistemaRecomendaciones() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Recomendable usuario) {
        usuarios.add(usuario);
    }

    public void mostrarRecomendaciones() {
        for (Recomendable usuario : usuarios) {
            usuario.obtenerRecomendaciones();
        }
    }
}
