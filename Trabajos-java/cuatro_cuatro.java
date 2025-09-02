public class cuatro_cuatro {
    public static void main(String[] args) {
        double numero_1 = 17.0;
        double numero_2 = -9.0;
        double numero_3 = 9.0;

        double raiz_1 = Math.sqrt(numero_1);
        double raiz_2 = Math.sqrt(numero_2);
        double raiz_3 = Math.sqrt(numero_3);

        System.out.println("La raíz cuadrada de " + numero_1 + " es: " + raiz_1);
        System.out.println("La raíz cuadrada de " + numero_2 + " es: " + raiz_2);
        System.out.println("La raíz cuadrada de " + numero_3 + " es: " + raiz_3);

        if (numero_1 < 0) {
            System.out.println("El número " + numero_1 + " no tiene raíz cuadrada.");
        }

        if (numero_2 < 0) {
            System.out.println("El número " + numero_2 + " no tiene raíz cuadrada.");
        }

        if (numero_3 < 0) {
            System.out.println("El número " + numero_3 + " no tiene raíz cuadrada.");
        }

    }
}
