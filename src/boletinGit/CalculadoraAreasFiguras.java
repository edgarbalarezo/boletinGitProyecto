package boletinGit;

import java.util.Scanner;

public class CalculadoraAreasFiguras {
    public static void ejecutarCalculadoraFiguras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la figura:");
        System.out.println("1 - Círculo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Triángulo");
        int opcion = sc.nextInt();
        double area = 0;
        switch (opcion){
            case 1:
                System.out.print("Ingrese el radio: ");
                double radio = sc.nextDouble();
                area = Math.PI * radio * radio;
                break;

            case 2:
                System.out.print("Ingrese el valor del lado del cuadrado: ");
                double lado = sc.nextDouble();
                area = lado * lado;
                break;

            case 3:
                System.out.print("Ingrese la base del triangulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = sc.nextDouble();
                area = (base * altura) / 2;
                break;


        }
    }
}
