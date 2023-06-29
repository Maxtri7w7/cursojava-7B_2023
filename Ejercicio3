import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();
        
        int dias;
        
        if (nombreMes.equalsIgnoreCase("febrero")) {
            dias = 28;
        } else if (nombreMes.equalsIgnoreCase("noviembre") || nombreMes.equalsIgnoreCase("abril") ||
                nombreMes.equalsIgnoreCase("junio") || nombreMes.equalsIgnoreCase("septiembre")) {
            dias = 30;
        } else {
            dias = 31;
        }
        
        System.out.println(nombreMes + " tiene " + dias + " días.");
    }
}
