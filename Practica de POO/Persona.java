public class Persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;

    // Metodo contructor de la clase
    // El constructor de la clase permite inicalizar la clase
    // El constructor de una clase se reconoce porque tiene el mismo nombre de la
    // clase
    // El operador this es una autorefencia al atributo de la clase
    public Persona(String nombre, String apellido, int edad, int cedula, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
    }
    // El metodo toString sirve para visualizar los objetos.
    public String toString() {
        return "persona [Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cedula: " + cedula
                + " Peso: " + peso + "]";
    }

    // Metodos Getters y Setters
    public String getNombre() { // Obtener el nombre
        return nombre;
     }

    public void setNombre(String nombre) { // modificar el nombre
        this.nombre = nombre;
     }
    

}