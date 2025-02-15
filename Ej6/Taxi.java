public class Taxi implements TransportePublico {
    private Conductor conductor;

    public Taxi(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        conductor.aceptarPasajero();
        System.out.println("Taxi iniciando viaje de " + origen + " a " + destino);
        conductor.finalizarViaje();
    }

    @Override
    public double calcularTarifa() {
        return 20.0;
    }
}