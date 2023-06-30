import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        
        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            
            if (numero < minimo) {
                minimo = numero;
            }
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            System.out.println("Número generado: " + numero);
            contador++;
        } while (contador < 10);
        
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El número máximo es: " + maximo);
    }
}
