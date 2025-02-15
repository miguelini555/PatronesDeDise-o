import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Inventario Almacen -----");
        Inventario inventario = new Inventario();
        
        Producto laptop = new Electronico(1200.0, 5);
        Producto camisa = new Ropa(25.0, 20);
        Producto manzana = new Alimento(1.5, 50, LocalDate.of(2025, 3, 15));
        
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(camisa);
        inventario.agregarProducto(manzana);
        
        inventario.mostrarInventario();
        
        if (manzana instanceof Almacenable) {
            ((Almacenable) manzana).guardarEnBodega();
            ((Almacenable) manzana).retirarDeBodega();
        }
    }
}
