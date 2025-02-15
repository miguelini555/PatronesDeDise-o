public class UsuarioRegular implements Recomendable {
    private String nombre;

    public UsuarioRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void obtenerRecomendaciones() {
        System.out.println("Recomendaciones para usuario regular " + nombre + ": Productos más populares.");
    }
}
