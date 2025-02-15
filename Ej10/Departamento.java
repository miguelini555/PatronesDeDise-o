public class Departamento implements Reservable {
    private String direccion;
    private boolean reservado;

    public Departamento(String direccion) {
        this.direccion = direccion;
        this.reservado = false;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Departamento en " + direccion + " reservado para la fecha: " + fecha);
        } else {
            System.out.println("El departamento ya está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva en departamento en " + direccion + " cancelada.");
        } else {
            System.out.println("No hay una reserva para cancelar.");
        }
    }
}