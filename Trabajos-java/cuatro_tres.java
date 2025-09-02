public class cuatro_tres {
    public static void main(String[] args) {

        double numero_1 = 6;
        double numero_2 = 9;
        double numero_3 = 7;

        if ((numero_1 >= numero_2 && numero_1 <= numero_3) || (numero_1 <= numero_2 && numero_1 >= numero_3)) {
            System.out.println("El numero " + numero_1 + " es el central.");
        } else if ((numero_2 >= numero_1 && numero_2 <= numero_3) || (numero_2 <= numero_1 && numero_2 >= numero_3)) {
            System.out.println("El numero " + numero_2 + " es el central.");
        } else if ((numero_3 >= numero_1 && numero_3 <= numero_2) || (numero_3 <= numero_1 && numero_3 >= numero_2)) {
            System.out.println("El numero " + numero_3 + " es el central.");
        }

    }
}
