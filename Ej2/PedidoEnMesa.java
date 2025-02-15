public class PedidoEnMesa implements Pedido {
    private int numeroMesa;

    public PedidoEnMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para mesa " + numeroMesa);
    }

    @Override
    public void entregar() {
        System.out.println("Sirviendo pedido en mesa " + numeroMesa);
    }

    @Override
    public String toString() {
        return "Pedido en mesa: " + numeroMesa;
    }
}

