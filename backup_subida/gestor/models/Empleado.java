package gestor.models;

public class Empleado {
    private static int contadorId = 1;
    private final int id;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public Empleado setNombre(String nombre) { this.nombre = nombre; return this; }
    public String getApellido() { return apellido; }
    public Empleado setApellido(String apellido) { this.apellido = apellido; return this; }
    public double getSalario() { return salario; }
    public Empleado setSalario(double salario) { this.salario = salario; return this; }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + " " + apellido + ", Salario=" + salario + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        return this.id == other.id;
    }
}
