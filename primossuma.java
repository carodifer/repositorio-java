import java.util.Scanner;
public class primossuma {
    public static boolean primo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumaprimos(int a, int b) {
        int suma = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            if (primo(i)) {
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa el segundo número del rango: ");
        int fin = scanner.nextInt();
        int resultado = sumaprimos(inicio, fin);
        System.out.println("La suma de los números primos entre " + inicio + " y " + fin + " es: " + resultado);
}
}