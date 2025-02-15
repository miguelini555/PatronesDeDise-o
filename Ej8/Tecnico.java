public class Tecnico implements Empleado {
    private double salarioBase;
    private double extra;

    public Tecnico(double salarioBase, double extra) {
        this.salarioBase = salarioBase;
        this.extra = extra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + extra;
    }

    @Override
    public String obtenerCargo() {
        return "Técnico";
    }
}
