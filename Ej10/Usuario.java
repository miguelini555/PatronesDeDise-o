public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void hacerReserva(Reservable lugar, String fecha) {
        System.out.println(nombre + " está realizando una reserva...");
        lugar.reservar(fecha);
    }

    public void cancelarReserva(Reservable lugar) {
        System.out.println(nombre + " está cancelando una reserva...");
        lugar.cancelarReserva();
    }
}