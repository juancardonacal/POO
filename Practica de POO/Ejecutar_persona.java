public class Ejecutar_persona {

    public static void main(String[] args) {


        // Forma#1
        // Creacion del objeto objPersona1 para hacer uso de la clase persona:
        /*
         * Ejemplo:
         * int a;
         * double f;
         * boolean r;
         * float m;
         * long t;
         * char p;
         * String nombre;
         */

        Persona objPersona1;

        // Instanciar el objeto (new) --> Instanciar es igual a crear (Darle vida al objeto)

        objPersona1 = new Persona("maicol", "hijodejack", 40, 1123445460, 65.5, 1.80);

        //Forma#2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0, 1.75);

        // personas creadas para la tarea.
        Persona objPersona3 = new Persona("Carles", "Sans", 28, 987654321, 75.0, 1.80);

        Persona objPersona4 = new Persona("Anacleta", "Spuns", 22, 123456789, 55.0, 1.65);

        Persona objPersona5 = new Persona("Fernando", "Fernandez", 30, 456789123, 80.0, 1.75);

        // Mostrar los objetos creados
        System.out.println(objPersona1.toString());

        System.out.println(objPersona2.toString());

        // Mostrar el nombre de la persona 1
        System.out.println(objPersona1.getNombre());
        // Moatrar el apellido de la persona 1
        System.out.println(objPersona1.getApellido());
        // Mostrar la edad de la persona 1
        System.out.println(objPersona1.getEdad());
        // Mostrar la cedula de la persona 1
        System.out.println(objPersona1.getCedula());
        // Mostrar el peso de la persona 1
        System.out.println(objPersona1.getPeso());
        // Mostrar la altura de la persona 1
        System.out.println(objPersona1.getAltura());

        // Modificar el nombre de la persona 2
        objPersona2.setNombre("Harvin");
        // Modificar el apellido de la persona 2
        objPersona2.setApellido("Noches");
        // Modificar la edad de la persona 2
        objPersona2.setEdad(30);
        // Modificar la cedula de la persona 2
        objPersona2.setCedula(1234567890);
        // Modificar el peso de la persona 2
        objPersona2.setPeso(70.0);
        // Modificar la altura de la persona 2
        objPersona2.setAltura(1.85);

        // Mostrar el objPersona2 con las modificaciones
        System.out.println(objPersona2.toString());

        // Mostrar las personas creadas para la tarea
        System.out.println(objPersona3.toString()); 
        System.out.println(objPersona4.toString());
        System.out.println(objPersona5.toString());

        // Este es el metodo saludar.
        System.out.println(objPersona1.saludar());

        // Este es el metodo para saber si la persona es mayor de edad.
        System.out.println(objPersona1.getNombre() + " es mayor de edad: " + objPersona1.esMayorDeEdad());

        // Este es el metodo para calcular el IMC.
        System.out.println("El IMC de " + objPersona1.getNombre() + " es: " + objPersona1.calcularIMC());




    }
    
}