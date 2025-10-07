public class Libro {

    // 1. Atributos ( Encapsulamiento con ’private ’)
    private String titulo ;
    private String autor ;
    private int anioPublicacion ;
    private int numeroPaginas ;
    private boolean prestado ;

    // 2. Constructor
    public Libro ( String titulo , String autor , int anioPublicacion , int numeroPaginas ) {
    this . titulo = titulo ;
        this . autor = autor ;
        this . anioPublicacion = anioPublicacion ;
        this . numeroPaginas = numeroPaginas ;
        this . prestado = false ; // Estado inicial
    }

    // 3. Getters ( Lectura )
    public String getTitulo () {
        return titulo ;
    }

    public String getAutor () {
        return autor ;
    }

    public int getAnioPublicacion () {
        return anioPublicacion ;
    }

    public int getNumeroPaginas () {
        return numeroPaginas ;
    }

    public boolean isPrestado () {
        return prestado ;
    }

    // 3. setters
    public void setAnioPublicacion ( int anio ) {
        if ( anio <= 2025 && anio > 0) {
            this.anioPublicacion = anio ;
        } else {
            System.out.println (" Error : Ano de publicacion invalido .");
        }
    }

    public void setNumeroPaginas ( int paginas ) {
        if ( paginas > 0) {
            this.numeroPaginas = paginas ;
        } else {
            System.out.println (" Error : Numero de paginas invalido .") ;
        }
    }

    // 4. Metodos de Negocio ( Comportamiento )
    public boolean prestar () {
        if (! this . prestado ) {
            this . prestado = true ;
            System . out . println ("El libro ’" + this . titulo + "’ ha sido prestado exitosamente .");
            return true ;
        } else {
            System . out . println ("El libro ’" + this . titulo + "’ ya esta prestado .");
            return false ;
        }
    }



    // 5. Metodo toString ()
    @Override
    public String toString () {

        String estado = this . prestado ? " PRESTADO " : " DISPONIBLE ";

        return " Libro [ Titulo : " + titulo +
            ", Autor : " + autor +
            ", Ano: " + anioPublicacion +
            ", Paginas : " + numeroPaginas +
            ", Estado : " + estado +
            "]";
    }
}


