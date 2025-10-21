public class EjecutarHerencia {

    public static void main (String[] argas) {

        Animal lucas = new perro();
        Animal ceniza = new gato();

        lucas.hacerSonido(); //Salida: el valor del metodo hacer sonido de la clase perro
        ceniza.hacerSonido(); 
    }
}