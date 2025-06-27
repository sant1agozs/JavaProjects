import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class App {
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintStream out = System.out;

  public static void main(String[] args) throws Exception {
    String colorElegido = "";
    String respuesta = "";
    boolean tieneLlave = false; // Valor boolean para otorgar una llave si el usuario adivina el mini-acertijo
    boolean entradaValida = false;

    // Instrucciones iniciales
    out.println("Estás frente a una caja con tres botones: rojo, azul y verde.");
    out.println("Una pista dice: 'El color del cielo al mediodía.'"); // Proveemos una pequena pista

    // Validación con do-while para forzar solo colores válidos
    do {
      out.print("¿Qué color eliges? (rojo, azul, verde): ");
      colorElegido = in.readLine().toLowerCase();
      entradaValida = colorElegido.equalsIgnoreCase("rojo") || colorElegido.equalsIgnoreCase("azul") || colorElegido.equalsIgnoreCase("verde"); // Con .equalsIgnoreCase nos deja de interesar las MAYUSCULAS o minusculas, mientras el usuario escriba uno de los 3 colores (aZuL, verde o ROJO)

      if (!entradaValida) {
        out.println("Entrada inválida. Solo puedes elegir: rojo, azul o verde.");
      }
    } while (!entradaValida);

    // Lógica de juego
    if (colorElegido.equalsIgnoreCase("azul")) {
      respuesta = "¡Correcto! Has encontrado una llave en la caja.";
      tieneLlave = true;
    } else {
      respuesta = "¡Error! Has recibido una descarga leve."; // Fin del juego
    }

    out.println(respuesta);
  }
}
