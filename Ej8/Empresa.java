import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.obtenerCargo());
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Cargo: " + empleado.obtenerCargo() + ", Salario: Bs" + empleado.calcularSalario());
        }
    }
}
