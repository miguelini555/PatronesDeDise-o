public class CasaVacacional implements Reservable {
    private String ubicacion;
    private boolean reservado;

    public CasaVacacional(String ubicacion) {
        this.ubicacion = ubicacion;
        this.reservado = false;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Casa vacacional en " + ubicacion + " reservada para la fecha: " + fecha);
        } else {
            System.out.println("La casa vacacional ya está reservada.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva en casa vacacional en " + ubicacion + " cancelada.");
        } else {
            System.out.println("No hay una reserva para cancelar.");
        }
    }
}