public class PedidosParaLlevar implements Pedido {
    private String descripcion;

    public PedidosParaLlevar(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para llevar: " + descripcion);
    }

    @Override
    public void entregar() {
        System.out.println("Pedido para llevar listo para recoger: " + descripcion);
    }
}
