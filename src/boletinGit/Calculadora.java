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
        System.out.println("Opción:");
        int opcion = sc.nextInt();
        System.out.println("Ingrese el segundo número:  ");
        double numero2 = sc.nextDouble();
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;

            case 2:
                resultado = numero1 - numero2;
                break;

            case 3:
                resultado = numero1 * numero2;
                break;

            case 4:
                if (numero2 ==0){
                    System.out.println("No se puede dividir entre 0");
                } else {
                    resultado = numero1 / numero2;
                }
                break;

            case 0:
                System.out.println("Operación cancelada");
                break;
            default:
                System.out.println("Opción inválida");
        }
        System.out.println("El resultado es: " +resultado);
    }
}
