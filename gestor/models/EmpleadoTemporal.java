package gestor.models;

public class EmpleadoTemporal extends Empleado {
    private int duracionMeses;

    public EmpleadoTemporal(String nombre, String apellido, double salario, int duracionMeses) {
        super(nombre, apellido, salario);
        this.duracionMeses = duracionMeses;
    }

    public int getDuracionMeses() { return duracionMeses; }
    public EmpleadoTemporal setDuracionMeses(int duracionMeses) { this.duracionMeses = duracionMeses; return this; }

    @Override
    public String toString() {
        return super.toString() + " [Temporal, Duración=" + duracionMeses + " meses]";
    }
}
