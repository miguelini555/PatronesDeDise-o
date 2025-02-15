public class Bus implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bus iniciando ruta de " + origen + " a " + destino);
    }

    @Override
    public double calcularTarifa() {
        return 2.5; 
    }
}
