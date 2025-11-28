package boletinGit;
import java.util.Scanner;
public class NumerosPrimos {
    public static void comprobarPrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " NO es primo.");
        }
    }
}
