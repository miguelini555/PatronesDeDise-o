import java.util.List;

public class UsuarioPremium implements Recomendable {
    private String nombre;
    private List<Producto> historialCompras;

    public UsuarioPremium(String nombre, List<Producto> historialCompras) {
        this.nombre = nombre;
        this.historialCompras = historialCompras;
    }

    @Override
    public void obtenerRecomendaciones() {
        System.out.println("Recomendaciones para usuario premium " + nombre + ":");
        for (Producto p : historialCompras) {
            System.out.println("Producto recomendado basado en compras previas: " + p.getNombre());
        }
    }
}
