package boletinGit;

import java.util.Scanner;

public class Calculadora {
    public static void ejecutarCalculadora(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
        double numero1= sc.nextDouble();
        System.out.println("Ingrese la operación:");
        System.out.println("\t1 - Suma" +
                "\n\t2 - Resta" +
                "\n\t3 - Multiplicación" +
                "\n\t4 - División" +
                "\n\t0 - Volver al menú\n");
    }
}
