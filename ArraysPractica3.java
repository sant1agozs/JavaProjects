import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class App {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        // Declaración de arreglos
        String[] articulos = new String[5];
        String[] clientes = new String[5];

        // Variable de control de menú
        int opcion = 0;

        // Menú con ciclo WHILE (como lo pidió el profe)
        while (opcion != 7) {
            out.println("\n-------------------------------");
            out.println("  Sistema de Inventarios");
            out.println("       Menú principal");
            out.println("-------------------------------");
            out.println("1- Lista de Artículos");
            out.println("2- Lista de Clientes");
            out.println("3- Actualizar Artículos");
            out.println("4- Actualizar Clientes");
            out.println("5- Nueva Lista de Artículos");
            out.println("6- Nueva Lista de Clientes");
            out.println("7- Salir");
            out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(in.readLine());

            // Switch según opción
            switch (opcion) {
                case 1:
                    Listar(articulos, "LISTA DE ARTÍCULOS");
                    break;
                case 2:
                    Listar(clientes, "LISTA DE CLIENTES");
                    break;
                case 3:
                    Actualizar(articulos, "ACTUALIZAR ARTÍCULOS");
                    break;
                case 4:
                    Actualizar(clientes, "ACTUALIZAR CLIENTES");
                    break;
                case 5:
                    Llenar(articulos, "NUEVA LISTA DE ARTÍCULOS");
                    break;
                case 6:
                    Llenar(clientes, "NUEVA LISTA DE CLIENTES");
                    break;
                case 7:
                    out.println("Programa finalizado.");
                    break;
                default:
                    out.println("Opción inválida.");
            }
        }
    }

    // Función para llenar el arreglo con datos del usuario
    public static void Llenar(String[] arreglo, String titulo) throws Exception {
        out.println("\n--- " + titulo + " ---");
        for (int i = 0; i < arreglo.length; i++) {
            out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            arreglo[i] = in.readLine();
        }
    }

    // Función para listar el contenido del arreglo
    public static void Listar(String[] arreglo, String titulo) {
        out.println("\n--- " + titulo + " ---");
        for (int i = 0; i < arreglo.length; i++) {
            out.println("[" + (i + 1) + "] " + arreglo[i]);
        }
    }

    // Función para actualizar un valor existente en el arreglo
    public static void Actualizar(String[] arreglo, String titulo) throws Exception {
        out.println("\n--- " + titulo + " ---");
        Listar(arreglo, titulo);
        out.print("Digite la posición que desea actualizar (1 a " + arreglo.length + "): ");
        int pos = Integer.parseInt(in.readLine()) - 1;

        if (pos >= 0 && pos < arreglo.length) {
            out.print("Digite el nuevo valor: ");
            arreglo[pos] = in.readLine();
        } else {
            out.println("Posición inválida.");
        }
    }
}
