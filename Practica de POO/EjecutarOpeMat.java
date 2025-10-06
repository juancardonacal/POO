import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main(String[] args) {

        //Capturar datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primer número entero...");
        int n1 = sc.nextInt();
        System.out.println("Digite segundo número entero...");
        int n2 = sc.nextInt();

        // Crear el objeto
        OperacionesMatematicas objOpe = new OperacionesMatematicas(n1, n2);

        // Acceder al método sumar
        System.out.println("La suma es: " + objOpe.sumar());

        // Acceder al método restar
        System.out.println("La resta es: " + objOpe.restar());

        // Acceder al método multiplicar
        System.out.println("La multiplicación es: " + objOpe.multiplicar());

        // Acceder al método dividir
        System.out.println("La división es: " + objOpe.dividir());

        sc.close();

        //Tarea: Crear por lo menos 5 operaciones matemáticas adicionales y ejecutarlas
        //con un menú.

        //Solución

        
    }
}