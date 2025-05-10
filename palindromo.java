import java.util.Scanner;

public class palindromo {

    public static int contar(String palabra) {
        int i = 0;
        while (true) {
            try {
                palabra.charAt(i);
                i++;
            } catch (Exception e) {
                break;
            }
        }
        return i;
    }

    public static boolean palindromo(String palabra) {
        String limpio = "";

        int i = 0;
        while (i < contar(palabra)) {
            char c = palabra.charAt(i);
            if (c != ' ') {
                limpio = limpio + c;
            }
            i++;
        }

        int inicio = 0;
        int fin = contar(limpio) - 1;

        while (inicio < fin) {
            if (limpio.charAt(inicio) != limpio.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String palabra = entrada.nextLine();

        if (palindromo(palabra)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}