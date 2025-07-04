import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class App {
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintStream out = System.out;

  public static void main(String[] args) throws Exception {
    // Entrada
    String codigo = "";
    String clave = "";

    // Intermedias
    int numeros = 0;
    int letras = 0;
    boolean repetido = false;
    int longitud = 0;
    char caracter = ' ';
    int posicion = 0;

    // Salida
    String resultado = "";

    // Solicitar entrada al usuario
    out.print("Ingrese el código de usuario: ");
    codigo = in.readLine();

    out.print("Ingrese la palabra clave: ");
    clave = in.readLine();

    longitud = clave.length();

    if (longitud < 8 || longitud > 12) {
      resultado = "Error: La palabra clave debe tener entre 8 y 12 caracteres.";
    } else {
      for (posicion = 0; posicion < longitud; posicion++) {
        caracter = clave.charAt(posicion);

        if (Character.isDigit(caracter)) {
          numeros++;
        }

        if (Character.isLetter(caracter)) {
          letras++;
        }

        if (posicion > 0 && caracter == clave.charAt(posicion - 1)) {
          repetido = true;
          break;
        }
      }

      if (numeros < 3 || letras < 3) {
        resultado = "Error: La palabra clave debe tener al menos 3 números y 3 letras.";
      } else if (repetido) {
        resultado = "Error: La palabra clave no puede tener caracteres repetidos consecutivos.";
      } else {
        resultado = "La palabra clave es válida.";
      }
    }

    // Mostrar salida final
    out.println(resultado);
  }
}
