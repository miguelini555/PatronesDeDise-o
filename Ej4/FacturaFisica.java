public class FacturaFisica implements Facturable {
    @Override
    public void generarFactura() {
        System.out.println("Factura física impresa y entregada al cliente.");
    }
}