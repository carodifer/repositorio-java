import java.util.Scanner;
public class sumdigitosdenum {
    public static int sumaDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            int ultimoDigito = n % 10;
            suma += ultimoDigito;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para sumar sus dígitos: ");
        int numero = scanner.nextInt();
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es " + resultado+".");
}
}