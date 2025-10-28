public class cliente {

    private int cedula;
    private String nombre;

    public cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;

        @Override
        public String toString() {
            return "cliente{" +
                    "cedula=" + cedula +
                    ", nombre='" + nombre + '\'' +
                    '}';
    }
}