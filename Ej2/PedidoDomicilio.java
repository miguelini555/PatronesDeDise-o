public class PedidoDomicilio implements Pedido {
    private String direccion;
    private Repartidor repartidor;

    public PedidoDomicilio(String direccion, Repartidor repartidor) {
        this.direccion = direccion;
        this.repartidor = repartidor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para domicilio: " + direccion);
    }

    @Override
    public void entregar() {
        repartidor.repartir(direccion);
    }

    @Override
    public String toString() {
        return "Pedido a domicilio: " + direccion;
    }
}