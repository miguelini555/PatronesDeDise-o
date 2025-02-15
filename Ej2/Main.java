public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        System.out.println("----- Gestion de Pedidos para un Restaurante -----");
        
        Pedido pedido1 = new PedidoParaLlevar("Hamburguesa Toby");
        Pedido pedido2 = new PedidoEnMesa(5);
        Pedido pedido3 = new PedidoDomicilio("Calle Molinares", new Motorizado());
        Pedido pedido4 = new PedidoDomicilio("Avenida Busch", new Ciclista());
        
        restaurante.agregarPedido(pedido1);
        restaurante.agregarPedido(pedido2);
        restaurante.agregarPedido(pedido3);
        restaurante.agregarPedido(pedido4);
        
        restaurante.procesarPedidos();
    }
}
