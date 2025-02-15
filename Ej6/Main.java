public class Main {
    public static void main(String[] args) {
        System.out.println("----- Transporte Urbano -----");
        Conductor conductorTaxi = new ConductorTaxi();
        TransportePublico taxi = new Taxi(conductorTaxi);
        TransportePublico bus = new Bus();
        TransportePublico bicicleta = new BicicletaCompartida();
        
        Usuario usuario = new Usuario("Carlos");
        
        usuario.solicitarViaje(taxi, "Centro", "Aeropuerto");
        usuario.solicitarViaje(bus, "Plaza", "Universidad");
        usuario.solicitarViaje(bicicleta, "Parque", "Calle 8");
    }
}
