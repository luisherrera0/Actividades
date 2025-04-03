import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase base abstracta que representa una Persona
abstract class PersonaBase {
    // Propiedades privadas (Encapsulamiento)
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    // Constructor para inicializar las propiedades (Abstracción)
    public PersonaBase(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    // Métodos públicos para acceder a las propiedades
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    // Método abstracto para mostrar información (Polimorfismo)
    public abstract void mostrarInformacion();
}

// Clase concreta que hereda de PersonaBase
class Persona extends PersonaBase {
    public Persona(String nombre, String apellido, String genero, int edad) {
        super(nombre, apellido, genero, edad);
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + ", Género: " + getGenero() + ", Edad: " + getEdad());
    }
}

public class ProgramaPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de gestión de personas!");
        System.out.println("A continuación, capturaremos información de 5 personas.\n");

        // Capturar datos de las personas
        List<Persona> personas = capturarPersonas(scanner);

        // Mostrar información de las personas
        System.out.println("\nInformación de las personas capturadas:");
        for (Persona persona : personas) {
            persona.mostrarInformacion();
        }

        // Calcular y mostrar estadísticas
        System.out.println("\nPromedio de edades: " + calcularPromedioEdades(personas));
        System.out.println("Cantidad de personas con género Masculino: " + contarGenero(personas, "Masculino"));
        System.out.println("Cantidad de personas con género Femenino: " + contarGenero(personas, "Femenino"));

        scanner.close();
    }

    // Método para capturar y retornar 5 personas
    private static List<Persona> capturarPersonas(Scanner scanner) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();
            System.out.print("Edad: ");
            int edad;

            // Validar que la edad sea un número válido
            while (true) {
                try {
                    edad = Integer.parseInt(scanner.nextLine());
                    if (edad < 0) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Por favor, ingrese una edad válida: ");
                }
            }

            personas.add(new Persona(nombre, apellido, genero, edad));
        }

        return personas;
    }

    // Método para calcular el promedio de edades
    private static double calcularPromedioEdades(List<Persona> personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / personas.size();
    }

    // Método para contar personas por género
    private static int contarGenero(List<Persona> personas, String genero) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }
        return contador;
    }
}