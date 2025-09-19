package gestor.models;

import java.util.ArrayList;

public class Departamento {
    private static int contadorId = 1;
    private final int id;
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("Nombre de departamento no puede ser nulo o vacío");
        this.id = contadorId++;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public Departamento setNombre(String nombre) { this.nombre = nombre; return this; }
    public ArrayList<Empleado> getEmpleados() { return empleados; }

    public boolean agregarEmpleado(Empleado e) {
        if (e == null) throw new IllegalArgumentException("Empleado no puede ser nulo");
        if (empleados.contains(e)) return false;
        empleados.add(e);
        return true;
    }

    public boolean eliminarEmpleado(Empleado e) {
        if (e == null) return false;
        return empleados.remove(e);
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado e : empleados) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) return e;
        }
        return null;
    }

    public String mostrarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : empleados) {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Departamento [ID=" + id + ", Nombre=" + nombre + ", Empleados=" + empleados.size() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departamento)) return false;
        Departamento other = (Departamento) obj;
        return this.id == other.id;
    }
}
