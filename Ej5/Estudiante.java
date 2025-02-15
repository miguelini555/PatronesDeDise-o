public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirse(Curso curso) {
        System.out.println(nombre + " se ha inscrito en un curso.");
        curso.iniciar();
    }

    public void completarCurso(Curso curso) {
        curso.completar();
    }
}