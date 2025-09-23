public class Persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;
    private double altura;

    // Metodo contructor de la clase
    // El constructor de la clase permite inicalizar la clase
    // El constructor de una clase se reconoce porque tiene el mismo nombre de la
    // clase
    // El operador this es una autorefencia al atributo de la clase
    public Persona(String nombre, String apellido, int edad, int cedula, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }
    // El metodo toString sirve para visualizar los objetos.
    public String toString() {
        return "persona [Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " + cedula
                + " Peso: " + peso + " Altura: " + altura + "]";
    }

    // Metodos Getters y Setters
    public String getNombre() { // Obtener el nombre
        return nombre;
    }

    public String getApellido() { // Obtener el apellido
        return apellido;
    }

    public int getEdad() { // Obtener la edad
        return edad;
    }

    public int getCedula() { // Obtener la cedula
        return cedula;
    }

    public double getPeso() { // Obtener el peso
        return peso;
    }

    public double getAltura() { // Obtener la altura
        return altura;
    }

    // Metodos Setters
    public void setNombre(String nombre) { // modificar el nombre
        this.nombre = nombre;
     }

    public void setApellido(String apellido) { // modificar el apellido
        this.apellido = apellido;
    }

    public void setEdad(int edad) { // modificar la edad
        this.edad = edad;
    }

    public void setCedula(int cedula) { // modificar la cedula
        this.cedula = cedula;
    }

    public void setPeso(double peso) { // modificar el peso
        this.peso = peso;
    }

    public void setAltura(double altura) { // modificar la altura
        this.altura = altura;
     }

    // Este metodo es para saludar.
    public String saludar() {
        return "Hola, " + nombre;
    }

    // Este metodo es para saber si es mayor de edad.
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // este metodo es para calcular el IMC (Indice de Masa Corporal) de la persona.
    public double calcularIMC() {
        return peso / (altura * altura);
    }
}