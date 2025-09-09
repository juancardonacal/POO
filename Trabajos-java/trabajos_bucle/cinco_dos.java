import java.util.Scanner;

public class DiasDelMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de un mes");
        String mes = scanner.nextLine().toLowerCase();

        System.out.println("¿Es el año bisiesto? (true/false):");
        boolean esBisiesto = scanner.nextBoolean();

        int numeroDeDias = 0;

        if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            numeroDeDias = 31;
        } else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            numeroDeDias = 30;
        } else if (mes.equals("febrero")) {
            if (esBisiesto) {
                numeroDeDias = 29;
            } else {
                numeroDeDias = 28;
            }
        } else {
            System.out.println("Nombre de mes no válido.");
            return;
        }

        System.out.println("El mes de " + mes + " tiene " + numeroDeDias + " días.");

        scanner.close();
    }
}
