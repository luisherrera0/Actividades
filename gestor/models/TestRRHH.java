package gestor.models;

public class TestRRHH {
    public static void main(String[] args) {
        // Crear administrador
        Administrador admin = new Administrador("admin", "1234");
        // Crear gestor
        controlers.GestorRRHH gestor = new controlers.GestorRRHH(admin);

        // Crear departamentos
        gestor.crearDepartamento("Recursos Humanos");
        gestor.crearDepartamento("IT");

        // Obtener departamento
        Departamento depRH = gestor.obtenerDepartamento(1);
        Departamento depIT = gestor.obtenerDepartamento(2);

        // Crear empleados
        Empleado e1 = new EmpleadoPermanente("Ana", "Gomez", 2500, "Seguro Médico");
        Empleado e2 = new EmpleadoTemporal("Luis", "Pérez", 1800, 6);

        // Asignar empleados
        gestor.asignarEmpleadoADepartamento(e1, depRH.getId());
        gestor.asignarEmpleadoADepartamento(e2, depIT.getId());

        // Mostrar departamentos y empleados
        System.out.println(gestor.mostrarTodosDepartamentos());

        // Crear y mostrar reportes
        ReporteDesempeno r1 = new ReporteDesempeno(e1, 90);
        ReporteDesempeno r2 = new ReporteDesempeno(e2, 75);
        java.util.ArrayList<ReporteDesempeno> reportes = new java.util.ArrayList<>();
        reportes.add(r1);
        reportes.add(r2);
        System.out.println(gestor.mostrarReportes(reportes));

        // Probar inicio de sesión
        System.out.println("Login correcto: " + gestor.iniciarSesion("admin", "1234"));
        System.out.println("Login incorrecto: " + gestor.iniciarSesion("admin", "wrong"));
    }
}
