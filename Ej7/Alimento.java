import java.time.LocalDate;

public class Alimento implements Producto, Almacenable {
    private double precio;
    private int stock;
    private LocalDate fechaCaducidad;

    public Alimento(double precio, int stock, LocalDate fechaCaducidad) {
        this.precio = precio;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public int obtenerStock() {
        return stock;
    }

    @Override
    public void guardarEnBodega() {
        System.out.println("Alimento guardado en bodega. Fecha de caducidad: " + fechaCaducidad);
    }

    @Override
    public void retirarDeBodega() {
        if (fechaCaducidad != null && fechaCaducidad.isBefore(LocalDate.now())) {
            System.out.println("No se puede retirar. Producto caducado.");
        } else {
            System.out.println("Alimento retirado de bodega.");
        }
    }
}