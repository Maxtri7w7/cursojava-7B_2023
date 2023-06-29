import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego Piedra, Papel o Tijera");
        System.out.println("------------------------------------------");

        // Obtener la opción del competidor 1
        System.out.print("Competidor 1, elige tu opción (0-Piedra, 1-Papel, 2-Tijera): ");
        int opcionCompetidor1 = scanner.nextInt();

        // Obtener la opción del competidor 2
        System.out.print("Competidor 2, elige tu opción (0-Piedra, 1-Papel, 2-Tijera): ");
        int opcionCompetidor2 = scanner.nextInt();

        // Verificar las opciones y determinar el ganador
        if ((opcionCompetidor1 == 0 && opcionCompetidor2 == 2) ||
                (opcionCompetidor1 == 1 && opcionCompetidor2 == 0) ||
                (opcionCompetidor1 == 2 && opcionCompetidor2 == 1)) {
            System.out.println("¡Competidor 1 es el ganador!");
        } else if ((opcionCompetidor1 == 0 && opcionCompetidor2 == 1) ||
                (opcionCompetidor1 == 1 && opcionCompetidor2 == 2) ||
                (opcionCompetidor1 == 2 && opcionCompetidor2 == 0)) {
            System.out.println("¡Competidor 2 es el ganador!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}
