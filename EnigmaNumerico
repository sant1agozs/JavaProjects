import java.io.BufferedReader;        
import java.io.InputStreamReader;      
import java.io.PrintStream;               

public class App {                        

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
  static PrintStream out = System.out;  

  public static void main(String[] args) throws Exception {  

    String entradaUsuario = "";         // Variable para guardar lo que el usuario escribe (en forma de texto)
    int numeroIngresado = 0;            // Variable para almacenar el número ingresado por el usuario (una vez convertido)
    String mensaje = "";                // Variable que guardará el resultado final a mostrar (correcto o incorrecto)

    // Presentación del acertijo al usuario
    out.println("Te encuentras frente a una puerta con un enigma:");
    out.println("\"Soy mayor que 10, menor que 20 y divisible por 3. ¿Qué número soy?\"");

    // Bucle para asegurar que el usuario solo ingrese números enteros positivos (no letras ni símbolos)
    do {
      out.print("Ingresa tu respuesta numérica: ");          // Se solicita al usuario que escriba su respuesta
      entradaUsuario = in.readLine();                        // Se lee la línea completa que el usuario escribe

      // Validación con expresión regular: si no son dígitos (números del 0 al 9), muestra mensaje de error
      if (!entradaUsuario.matches("\\d+")) {
        out.println("Entrada inválida. Solo se permiten números enteros positivos.");
      }

    } while (!entradaUsuario.matches("\\d+"));                // Se repite mientras la entrada no sea un número válido

    // Conversión de la cadena de texto ingresada a un número entero (ya se validó que es seguro)
    numeroIngresado = Integer.parseInt(entradaUsuario);

    // Validación del número según las condiciones del acertijo (mayor que 10, menor que 20, divisible entre 3)
    // Los únicos valores que cumplen con eso son 12, 15 y 18
    if (numeroIngresado == 12 || numeroIngresado == 15 || numeroIngresado == 18) {
      mensaje = "¡Correcto! La puerta se abre lentamente.";   // Mensaje para respuesta correcta
    } else {
      mensaje = "Incorrecto. La puerta permanece cerrada.";   // Mensaje para respuesta incorrecta
    }

    // Se imprime el mensaje final en pantalla (resultado del acertijo)
    out.println(mensaje);
  }
}
