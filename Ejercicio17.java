import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPares = 0;
        int contadorPares = 0;

        // Obtener las tres evaluaciones del alumno
        System.out.print("Ingrese la evaluación 1: ");
        int evaluacion1 = scanner.nextInt();

        System.out.print("Ingrese la evaluación 2: ");
        int evaluacion2 = scanner.nextInt();

        System.out.print("Ingrese la evaluación 3: ");
        int evaluacion3 = scanner.nextInt();

        // Calcular el promedio
        int promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        // Verificar si el alumno aprobó o reprobó
        if (promedio >= 7) {
            System.out.println("El alumno ha aprobado.");
        } else {
            System.out.println("El alumno ha reprobado.");
        }

        // Calcular la suma de los valores pares sin usar if
        int[] evaluaciones = {evaluacion1, evaluacion2, evaluacion3};
        for (int i = 0; i < evaluaciones.length; i++) {
            if (evaluaciones[i] % 2 == 0) {
                sumaPares += evaluaciones[i];
                contadorPares++;
            }
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}
