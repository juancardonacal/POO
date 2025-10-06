import java.util.Scanner; // Importa la clase Scanner

public class ScannerEjemplo {
    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para leer desde la consola (a mi me gusta
        //usar "input":3)
        Scanner input = new Scanner(System.in);

        // 2. Pedir datos al usuario y leerlos
        System.out.println("Introduce tu nombre:");
        String nombre = input.nextLine(); // Lee el nombre como una cadena de texto

        System.out.println("Introduce tu edad:");
        int edad = input.nextInt(); // Lee la edad como un número entero

        // 3. Mostrar los datos en la consola
        System.out.println("Hola, " + nombre + "!"); // Muestra el nombre ingresado
        System.out.println("Tienes " + edad + " años."); // Muestra la edad ingresada

        // 4. Cierra el Scanner al terminar para liberar recursos
        input.close();
    }
}