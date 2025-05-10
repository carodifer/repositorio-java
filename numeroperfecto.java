import java.util.Scanner;

public class numeroperfecto{
    public static boolean perfecto(int n) {
        if (n <= 1) {
            return false;
        }
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();

        if (perfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}