package gestor.models;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;

    public EmpleadoPermanente(String nombre, String apellido, double salario, String beneficios) {
        super(nombre, apellido, salario);
        this.beneficios = beneficios;
    }

    public String getBeneficios() { return beneficios; }
    public EmpleadoPermanente setBeneficios(String beneficios) { this.beneficios = beneficios; return this; }

    @Override
    public String toString() {
        return super.toString() + " [Permanente, Beneficios=" + beneficios + "]";
    }
}
