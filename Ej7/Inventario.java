import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario.");
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getClass().getSimpleName() + ", Precio: Bs" + producto.obtenerPrecio() + ", Stock: " + producto.obtenerStock());
        }
    }
}