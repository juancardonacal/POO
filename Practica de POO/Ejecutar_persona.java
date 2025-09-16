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

        objPersona1 = new Persona("maicol", "hijodejack", 40, 1123445460, 65.5);

        //Forma#2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0);


        // Mostrar los objetos creados
        System.out.println(objPersona1.toString());

        System.out.println(objPersona2.toString());

        // Mostrar el nombre de la persona 1
        System.out.println(objPersona1.getNombre());

        // Modificar el nombre de la persona 2
        objPersona2.setNombre("Harvin");

        // Mostrar el objPersona2 con la modificacion del nombre
        System.out.println(objPersona2.toString());


        

    }
    
}