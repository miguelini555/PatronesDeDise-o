public class Motorizado implements Repartidor {
    @Override
    public void repartir(String direccion) {
        System.out.println("Entregando en moto a: " + direccion);
    }
}

