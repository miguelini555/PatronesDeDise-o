public class Compra {
    private MetodoPago metodoPago;
    private Facturable factura;
    private double monto;

    public Compra(MetodoPago metodoPago, Facturable factura, double monto) {
        this.metodoPago = metodoPago;
        this.factura = factura;
        this.monto = monto;
    }

    public void realizarCompra() {
        metodoPago.procesarPago(monto);
        factura.generarFactura();
    }
    
    @Override
    public String toString() {
        return "Compra de Bs" + monto + " con " + metodoPago.getClass().getSimpleName() + " y factura " + factura.getClass().getSimpleName();
    }
}