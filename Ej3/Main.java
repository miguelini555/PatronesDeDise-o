public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");
        
        Interactuable foto = new Foto("En la playa");
        Interactuable video = new Video("Tutorial de Java");
        Interactuable articulo = new Articulo("Los beneficios del ejercicio");
        
        usuario.interactuar(foto, "Hermosa foto!", "Me encanta");
        usuario.interactuar(video, "Muy bueni, gracias!", "Me gusta");
        usuario.interactuar(articulo, "Información  interesante", "Me encanta");
    }
}