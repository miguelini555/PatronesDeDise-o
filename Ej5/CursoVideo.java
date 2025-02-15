public class CursoVideo implements Curso {
    @Override
    public void iniciar() {
        System.out.println("Reproduciendo curso en video...");
    }
    
    @Override
    public void completar() {
        System.out.println("Curso en video completado.");
    }
}