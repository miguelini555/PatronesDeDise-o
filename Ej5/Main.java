public class Main {
    public static void main(String[] args) {
        System.out.println("----- Plataforma Aprendizaje Online -----");

        Curso video = new CursoVideo();
        Curso pdf = new CursoPDF();
        CursoExamen examen = new CursoExamen();
        
        Estudiante estudiante = new Estudiante("Juan");
        
        estudiante.inscribirse(video);
        estudiante.completarCurso(video);
        
        estudiante.inscribirse(pdf);
        estudiante.completarCurso(pdf);
        
        estudiante.inscribirse(examen);
        estudiante.completarCurso(examen);
        examen.calificar(100);
    }
}
