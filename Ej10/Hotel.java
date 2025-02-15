public class Hotel implements Reservable, Calificable {
    private String nombre;
    private boolean reservado;
    private int calificacion;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.reservado = false;
    }

    @Override
    public void reservar(String fecha) {
        if (!reservado) {
            reservado = true;
            System.out.println("Hotel " + nombre + " reservado para la fecha: " + fecha);
        } else {
            System.out.println("El hotel ya está reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva en hotel " + nombre + " cancelada.");
        } else {
            System.out.println("No hay una reserva para cancelar.");
        }
    }

    @Override
    public void calificar(int estrellas) {
        this.calificacion = estrellas;
        System.out.println("Hotel " + nombre + " calificado con " + estrellas + " estrellas.");
    }
}
