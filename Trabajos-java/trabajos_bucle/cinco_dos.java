import java.util.Scanner;

public class cinco_dos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el nombre de un mes");
        String mes = input.nextLine().toLowerCase();

        System.out.println("¿Es año bisiesto? (true/false):");
        boolean bisiesto = input.nextBoolean();

        int numerodias = 0;

        if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            numerodias = 31;
        } else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            numerodias = 30;
        } else if (mes.equals("febrero")) {
            if (bisiesto) {
                numerodias = 29;
            } else {
                numerodias = 28;
            }
        } else {
            System.out.println("Nombre de mes no válido.");
            input.close();
            return;
        }

        System.out.println("El mes de " + mes + " tiene " + numerodias + " días.");

        input.close();
    }
}
