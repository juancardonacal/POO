import java.util.scanner;

public class condisionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("ingrese otro numero: ");
        int numero_2 = scanner.nextInt();

        if (numero > numero_2) {
            System.out.println("El primer numero es el mayor");
        } else if (numero < numero_2) {
            System.out.println("El primer numero es el mas pequeño");
        } else {
            System.out.println("Los numeros son iguales");
        }


}
