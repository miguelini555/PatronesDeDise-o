public class BicicletaCompartida implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bicicleta compartida usada de " + origen + " a " + destino);
    }

    @Override
    public double calcularTarifa() {
        return 1.0;
    }
}