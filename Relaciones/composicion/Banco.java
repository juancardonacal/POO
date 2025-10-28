public class Banco {

    private String nombre;
    private Cuenta cuenta;

    public Banco(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public boolean crearcliente(cliente cliente) {
        return true;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}