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
    int Contador = 1;

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
        out.println("Intentos restantes: " + (5 - Contador));   
      } else if (colorElegido.equalsIgnoreCase("rojo") || colorElegido.equalsIgnoreCase("verde")) {
        out.println("¡Error! El color ingresado es incorrecto, intentos restantes: " + (5 - Contador)); 
      } else if (colorElegido.equalsIgnoreCase("azul")) {
        out.println("¡Has elegido el color correcto! Has encontrado una llave en la caja"); // Mensaje de éxito si el color es azul
        entradaValida = true; // Salimos del bucle si la entrada es válida
      }
      Contador++;
    } while (Contador <= 5); // Permite hasta 5 intentos
    
    if (Contador > 5) {
      out.println("Has agotado tus intentos. Fin del juego.");
    }    
  }
}
