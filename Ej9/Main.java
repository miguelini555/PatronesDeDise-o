import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Recomendacion de Productos -----");
        Producto laptop = new Producto("Laptop", "Electrónica", 1200.0);
        Producto smartphone = new Producto("Smartphone", "Electrónica", 800.0);
        
        UsuarioPremium premium = new UsuarioPremium("Carlos", Arrays.asList(laptop, smartphone));
        UsuarioRegular regular = new UsuarioRegular("Ana");
        
        SistemaRecomendaciones sistema = new SistemaRecomendaciones();
        sistema.agregarUsuario(premium);
        sistema.agregarUsuario(regular);
        
        sistema.mostrarRecomendaciones();
    }
}