public class Main {
    public static void main(String[] args) {
        System.out.println("----- Reserva Hoteles -----");
        Usuario usuario = new Usuario("Jose");
        Hotel hotel = new Hotel("Hotel Presidente");
        Departamento depto = new Departamento("Calle. Potosi");
        CasaVacacional casa = new CasaVacacional("Centro");
        
        usuario.hacerReserva(hotel, "15 de Marzo");
        usuario.hacerReserva(depto, "20 de Abril");
        usuario.hacerReserva(casa, "5 de Mayo");
        
        hotel.calificar(5);
        
        usuario.cancelarReserva(hotel);
    }
}
