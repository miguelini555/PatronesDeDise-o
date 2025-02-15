public class Ciclista implements Repartidor {
    @Override
    public void repartir(String direccion) {
        System.out.println("Entregando en bicicleta a: " + direccion);
    }
}