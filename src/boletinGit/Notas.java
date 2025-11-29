package boletinGit;
import java.util.Scanner;

public class Notas {
        public static void calcularMediaClase() {
            Scanner sc = new Scanner(System.in);

            System.out.print("¿Cuántos alumnos hay? ");
            int numAlumnos = sc.nextInt();

            double sumaNotas = 0;

            for (int i = 1; i <= numAlumnos; i++) {
                System.out.print("Introduce la nota del alumno " + i + ": ");
                double nota = sc.nextDouble();
                sumaNotas += nota;
            }

            double media = sumaNotas / numAlumnos;

            System.out.println("La media de la clase es: " + media);
        }
    }

