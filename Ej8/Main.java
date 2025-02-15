public class Main {
    public static void main(String[] args) {
        System.out.println("----- Gestion Empleados de una Empresa -----");
        Empresa empresa = new Empresa();
        
        Empleado admin = new Administrativo(2000.0);
        Empleado tecnico = new Tecnico(2500.0, 500.0);
        Empleado gerente = new Gerente(5000.0, 1000.0);
        
        empresa.agregarEmpleado(admin);
        empresa.agregarEmpleado(tecnico);
        empresa.agregarEmpleado(gerente);
        
        empresa.mostrarEmpleados();
    }
}