public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        System.out.println(nombre + " ha solicitado un viaje.");
        transporte.iniciarViaje(origen, destino);
        System.out.println("Tarifa: Bs" + transporte.calcularTarifa());
    }
}