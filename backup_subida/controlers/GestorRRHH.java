package controlers;

import gestor.models.*;
import java.util.ArrayList;

public class GestorRRHH {
    private ArrayList<Departamento> departamentos;
    private Administrador miAdministrador;

    public GestorRRHH() {
        this.departamentos = new ArrayList<>();
    }

    public GestorRRHH(Administrador admin) {
        this();
        this.miAdministrador = admin;
    }

    public boolean crearDepartamento(String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;
        return departamentos.add(new Departamento(nombre));
    }

    public Departamento obtenerDepartamento(int id) {
        for (Departamento d : departamentos) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    public ArrayList<Departamento> getDepartamentos() { return departamentos; }

    public boolean asignarEmpleadoADepartamento(Empleado e, int idDepartamento) {
        Departamento dep = obtenerDepartamento(idDepartamento);
        if (dep == null) return false;
        try {
            return dep.agregarEmpleado(e);
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }

    public boolean eliminarEmpleadoDeDepartamento(Empleado e, int idDepartamento) {
        Departamento dep = obtenerDepartamento(idDepartamento);
        if (dep == null) return false;
        return dep.eliminarEmpleado(e);
    }

    public String mostrarTodosDepartamentos() {
        StringBuilder sb = new StringBuilder();
        for (Departamento d : departamentos) {
            sb.append(d).append("\n");
            sb.append(d.mostrarEmpleados());
        }
        return sb.toString();
    }

    public String mostrarReportes(ArrayList<ReporteDesempeno> reportes) {
        StringBuilder sb = new StringBuilder();
        for (ReporteDesempeno r : reportes) {
            sb.append(r).append("\n");
        }
        return sb.toString();
    }

    public boolean iniciarSesion(String user, String password) {
        if (this.miAdministrador == null) return false;
        return this.miAdministrador.getUsername().equals(user)
            && this.miAdministrador.getPassword().equals(password);
    }
}
