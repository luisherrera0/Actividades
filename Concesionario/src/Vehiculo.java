public class Vehiculo {
    private String codigo;
    private String marca;
    private String tipo; // auto, camioneta, motocicleta
    private int modelo; // Año
    private int kilometraje;

    // Constructor
    public Vehiculo(String codigo, String marca, String tipo, int modelo, int kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        if (modelo > 1885) { // Validación básica
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("El modelo debe ser mayor a 1885.");
        }
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if (kilometraje >= 0) {
            this.kilometraje = kilometraje;
        } else {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", modelo=" + modelo +
                ", kilometraje=" + kilometraje +
                '}';
    }
}