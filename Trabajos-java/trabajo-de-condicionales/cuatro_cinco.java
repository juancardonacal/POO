public class cuatro_cinco {
    public static void main(String[] args) {
        int numero = 11;
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par, porque no tiene residuo al dividir entre 2.");
        } else {
            System.out.println(numero + " es un número impar, porque tiene residuo al dividir entre 2.");
        }

        int resultado = numero / 2;

        if (numero - resultado == resultado) {
            System.out.println("El número es par, porque la resta del número y su mitad es igual a su otra mitad");
        } else {
            System.out.println("El número es impar, porque la resta del número y su mitad no es un numero entero");
        }
    }
}
