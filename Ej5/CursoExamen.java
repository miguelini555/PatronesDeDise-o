public class CursoExamen implements Curso, Evaluable {
    @Override
    public void iniciar() {
        System.out.println("Iniciando examen en línea...");
    }
    
    @Override
    public void completar() {
        System.out.println("Examen completado.");
    }
    
    @Override
    public void calificar(int puntaje) {
        System.out.println("Examen calificado con puntaje: " + puntaje);
    }
}
