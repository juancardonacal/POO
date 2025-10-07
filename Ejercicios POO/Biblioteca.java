class Biblioteca {
    public static void main ( String [] args ) {
        // Creacion del primer objeto ( Instancia )
        System.out.println (" --- Anadiendo ’Cien Anos de Soledad ’ ---");
        Libro libro1 = new Libro (" Cien Anos de Soledad ", " Gabriel Garcia Marquez ", 1967 ,496) ;
        // Uso del toString () y un getter
        System.out.println (" Datos iniciales : " + libro1 ) ;
        System.out.println (" Autor : " + libro1 . getAutor () ) ;

        // Uso de un setter y un metodo de negocio
        libro1.setAnioPublicacion (1970) ;
        libro1.prestar () ;

        // Verificar estado con toString ()
        System.out.println (" Estado final : " + libro1 );

        // Creacion de un segundo objeto
        System.out.println ("\n--- Anadiendo ’El Senor de los Anillos ’ ---") ;
        Libro libro2 = new Libro ("El Senor de los Anillos ", "J.R.R. Tolkien ", 1954 ,1216) ;
        libro2.prestar();

        // creacion de un tercer objeto propio :V
        System.out.println("\n--- Anadiendo 'cronica de una muerte anunciada' ---");
        Libro libro3 = new Libro("cronica de una muerte anunciada", "Gabriel Garcia Marquez", 1981, 144);
        System.out.println("Datos iniciales: " + libro3);
        System.out.println("Titulo: " + libro3.getTitulo());
        System.out.println("Anio de publicación: " + libro3.getAnioPublicacion());
        System.out.println("Número de páginas: " + libro3.getNumeroPaginas());
        System.out.println("Autor: " + libro3.getAutor());

        libro3.setNumeroPaginas(250);
        libro3.prestar();

        System.out.println("Estado final: " + libro3);


    }
}
