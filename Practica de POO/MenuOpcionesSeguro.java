import java.util.Scanner;

public class MenuOpcionesSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;

        do {
            System.out.println("=== MENÚ DE OPCIONES ===");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Validar que el usuario ingrese un número
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        operar(sc, "suma");
                        break;
                    case 2:
                        operar(sc, "resta");
                        break;
                    case 3:
                        operar(sc, "multiplicación");
                        break;
                    case 4:
                        operar(sc, "división");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta nuevamente.");
                }
            } else {
                // Si no es un número, mostrar mensaje y limpiar la entrada
                System.out.println("⚠️ Entrada inválida. Debes ingresar un número.");
                sc.next(); // descarta la entrada no numérica
            }

            System.out.println(); // Línea en blanco para separar ciclos
        } while (!salir);

        sc.close();
    }
