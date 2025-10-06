public class OperacionesMatematicas {

    // Atributos de la clase
    private int a;
    private int b;

    // Constructor: permite inicializar la clase
    public OperacionesMatematicas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Métodos
    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public double dividir() {
        double resultado;
        if (b == 0) {
            resultado = 0.0;
        } else {
            // (double) significa hacer una conversión de entero a real (CAST)
            resultado = (double) a / (double) b;
        }
        return resultado;
    }

}