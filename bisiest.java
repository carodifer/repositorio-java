import java.util.Scanner;
public class bisiest {
    public static boolean bisiesto(int ao) {
        if (ao % 4 == 0) {
            if (ao % 100 == 0) {
                if (ao % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año para verificar si es bisiesto: ");
        int ao = scanner.nextInt();
        if (bisiesto(ao)) {
            System.out.println(ao + " es un año bisiesto.");
        } else {
            System.out.println(ao + " no es un año bisiesto.");
 }
}
}