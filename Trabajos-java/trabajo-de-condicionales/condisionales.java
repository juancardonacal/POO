import java.util.Scanner;

public class condisionales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();

        System.out.print("Ingrese otro número: ");
        int numero_2 = input.nextInt();

        if (numero > numero_2) {
            System.out.println("El primer numero es el mayor");
        } else if (numero < numero_2) {
            System.out.println("El primer numero es el mas pequeño");
        } else {
            System.out.println("Los numeros son iguales");
             
        }

        input.close();
        /*
         * ejecutar en la terminal de manera manual con los
         * comandos de manera que no sea necesario usar el
         * debugger para que el
         * scanner funcione correctamente.
         */
    }


}
