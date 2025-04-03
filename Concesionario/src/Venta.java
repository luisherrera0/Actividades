public class Venta {
    private double monto;
    private Vehiculo vehiculo; // Cambiado para almacenar el objeto Vehiculo
    private String apellidoComprador;
    private String nombreComprador;
    private String documentoComprador;

    // Constructor
    public Venta(double monto, Vehiculo vehiculo, String apellidoComprador, String nombreComprador, String documentoComprador) {
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.apellidoComprador = apellidoComprador;
        this.nombreComprador = nombreComprador;
        this.documentoComprador = documentoComprador;
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getApellidoComprador() {
        return apellidoComprador;
    }

    public void setApellidoComprador(String apellidoComprador) {
        this.apellidoComprador = apellidoComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getDocumentoComprador() {
        return documentoComprador;
    }

    public void setDocumentoComprador(String documentoComprador) {
        this.documentoComprador = documentoComprador;
    }

    public String toString() {
        return "Venta:\n" +
               "\tMonto: $" + monto + "\n" +
               "\tVehículo: " + vehiculo.getCodigo() + " (" + vehiculo.getMarca() + ", " + vehiculo.getModelo() + ")\n" +
               "\tComprador: " + nombreComprador + " " + apellidoComprador + "\n" +
               "\tDocumento: " + documentoComprador + "\n" +
               "-----------------------------";
    }

}