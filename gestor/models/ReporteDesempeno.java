package gestor.models;

public class ReporteDesempeno {
    private Empleado empleado;
    private int puntaje; // 0 a 100

    public ReporteDesempeno(Empleado empleado, int puntaje) {
        if (empleado == null) throw new IllegalArgumentException("Empleado no puede ser nulo");
        setPuntaje(puntaje);
        this.empleado = empleado;
    }

    public Empleado getEmpleado() { return empleado; }
    public int getPuntaje() { return puntaje; }
    public ReporteDesempeno setPuntaje(int puntaje) {
        if (puntaje < 0 || puntaje > 100)
            throw new IllegalArgumentException("Puntaje debe estar entre 0 y 100");
        this.puntaje = puntaje;
        return this;
    }

    @Override
    public String toString() {
        return "ReporteDesempeno [Empleado=" + empleado.getNombre() + ", Puntaje=" + puntaje + "]";
    }
}
