import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        int numAleatorioEntero, numAdivinar = 0, cont, Escenario;
        String msgResultado = "";
        boolean adivinado = false;

        out.println("Por favor, selecciona:");
        out.println("1 → Juego de 3 intentos (número entre 0 y 10)");
        out.println("2 → Juego de 6 intentos (número entre 0 y 20)");
        out.println("3 → Juego de 10 intentos (número entre 20 y 100)");
        Escenario = Integer.parseInt(in.readLine());

        switch (Escenario) {

            case 1:
                numAleatorioEntero = (int)(Math.random() * 11); // 0-10
                for (cont = 1; cont <= 3; cont++) {
                    out.println("Intento " + cont + ": Trate de adivinar el número");
                    numAdivinar = Integer.parseInt(in.readLine());

                    if (numAleatorioEntero == numAdivinar) {
                        msgResultado = "¡Felicidades, adivinó!";
                        adivinado = true;
                        break;
                    } else if (numAleatorioEntero < numAdivinar) {
                        msgResultado = "Pruebe con un número menor";
                    } else {
                        msgResultado = "Pruebe con un número mayor";
                    }

                    if (!adivinado && cont == 2) {
                        if (numAleatorioEntero % 2 == 0) {
                            out.println(msgResultado + " shh, pequeña pista! El número es par!");
                        } else {
                            out.println(msgResultado + " shh, pequeña pista! El número es impar!");
                        }
                    } else if (!adivinado && cont < 3) {
                        out.println(msgResultado);
                    }
                }

                if (!adivinado) {
                    out.println("No logró adivinar el número! El número correcto era: " + numAleatorioEntero);
                } else {
                    out.println(msgResultado);
                }
                break;

            case 2:
                numAleatorioEntero = (int)(Math.random() * 21); // 0-20
                for (cont = 1; cont <= 6; cont++) {
                    out.println("Intento " + cont + ": Trate de adivinar el número");
                    numAdivinar = Integer.parseInt(in.readLine());

                    if (numAleatorioEntero == numAdivinar) {
                        msgResultado = "¡Felicidades, adivinó!";
                        adivinado = true;
                        break;
                    } else if (numAleatorioEntero < numAdivinar) {
                        msgResultado = "Pruebe con un número menor";
                    } else {
                        msgResultado = "Pruebe con un número mayor";
                    }

                    if (!adivinado && cont == 3) { 
                        if (numAleatorioEntero % 2 == 0) {
                            out.println(msgResultado + " shh, pequeña pista! El número es par!");
                        } else {
                            out.println(msgResultado + " shh, pequeña pista! El número es impar!");
                        }
                    } else if (!adivinado && cont < 6) {
                        out.println(msgResultado);
                    }
                }

                if (!adivinado) {
                    out.println("No logró adivinar el número. El número correcto era: " + numAleatorioEntero);
                } else {
                    out.println(msgResultado);
                }
                break;

            case 3:
                numAleatorioEntero = (int)(Math.random() * 81) + 20; // 20-100
                for (cont = 1; cont <= 10; cont++) {
                    out.println("Intento " + cont + ": Trate de adivinar el número");
                    numAdivinar = Integer.parseInt(in.readLine());

                    if (numAleatorioEntero == numAdivinar) {
                        msgResultado = "¡Felicidades, adivinó!";
                        adivinado = true;
                        break;
                    } else if (numAleatorioEntero < numAdivinar) {
                        msgResultado = "Pruebe con un número menor";
                    } else {
                        msgResultado = "Pruebe con un número mayor";
                    }

                    if (!adivinado && cont == 5) {
                        if (numAleatorioEntero % 2 == 0) {
                            out.println(msgResultado + " shh, pequeña pista! El número es par!");
                        } else {
                            out.println(msgResultado + " shh, pequeña pista! El número es impar!");
                        }
                    } else if (!adivinado && cont < 10) {
                        out.println(msgResultado);
                    }
                }

                if (!adivinado) {
                    out.println("No logró adivinar el número. El número correcto era: " + numAleatorioEntero);
                } else {
                    out.println(msgResultado);
                }
                break;

            default:
                out.println("Opción no válida, por favor seleccione 1, 2, o 3.");
                break;
        }
    }
}
