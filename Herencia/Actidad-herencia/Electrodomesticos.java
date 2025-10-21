public class Electrodomesticos {

    protected String marca;
    protected String modelo;
    protected double precio;
    protected boolean encendido;
    protected boolean funcionando;

    public Electrodomesticos(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.encendido = false;
        this.funcionando = false;
    }

    public void encender() {
        encendido = true;
        System.out.println("El electrodoméstico está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El electrodoméstico está apagado.");

    }

    public void estaFuncionando() {
        if (funcionando == true) {
            System.out.println("El electrodoméstico está funcionando.");
        } else {
            System.out.println("El electrodoméstico no está funcionando.");
        }
    }
}