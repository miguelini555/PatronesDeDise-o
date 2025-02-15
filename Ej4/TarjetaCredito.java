public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de Bs" + monto + " procesado con Tarjeta de Crédito.");
    }
}


