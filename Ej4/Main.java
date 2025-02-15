public class Main {
    public static void main(String[] args) {
    System.out.println("----- Pago y Facturacion Empresa -----");

        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        MetodoPago transferencia = new TransferenciaBancaria();

        Facturable facturaElectronica = new FacturaElectronica();
        Facturable facturaFisica = new FacturaFisica();

        Compra compra1 = new Compra(tarjeta, facturaElectronica, 100.50);
        Compra compra2 = new Compra(paypal, facturaFisica, 200.75);
        Compra compra3 = new Compra(transferencia, facturaElectronica, 50.25);

        compra1.realizarCompra();
        compra2.realizarCompra();
        compra3.realizarCompra();
    }
}