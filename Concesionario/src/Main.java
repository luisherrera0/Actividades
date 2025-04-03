import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo auto = new Auto("A001", "Toyota", 2020, 15000);
        Vehiculo camioneta = new Camioneta("C001", "Ford", 2018, 30000);
        Vehiculo motocicleta = new Motocicleta("M001", "Yamaha", 2022, 5000);

        // Crear lista de ventas
        List<Venta> ventas = new ArrayList<>();

        // Registrar ventas
        ventas.add(new Venta(25000, auto, "Pérez", "Juan", "12345678"));
        ventas.add(new Venta(35000, camioneta, "López", "Carlos", "98765432"));
        ventas.add(new Venta(15000, motocicleta, "Gómez", "Ana", "87654321"));

        // Mostrar vehículos y sus ventas
        System.out.println("Vehículos y ventas registradas:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }
}