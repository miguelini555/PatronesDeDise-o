public class ConductorTaxi implements Conductor {
    @Override
    public void aceptarPasajero() {
        System.out.println("Conductor de taxi ha aceptado un pasajero.");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("Conductor de taxi ha finalizado el viaje.");
    }
}