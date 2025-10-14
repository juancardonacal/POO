import java.util.Scanner;

public class cinco_uno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0, contador = 0;

        do {
            System.out.print("Introduce un número: ");
            numero = input.nextInt();
            System.out.println("Has introducido: " + numero);
            contador++;
        } while (contador < 5); // Example condition, replace as needed

        input.close();
    }
}
