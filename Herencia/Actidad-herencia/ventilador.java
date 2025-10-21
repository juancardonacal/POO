public class ventilador extends Electrodomesticos {

    public ventilador(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    public void encender() {
        System.out.println("El ventilador está encendido.");
    }

    public void apagar() {
        System.out.println("El ventilador está apagado.");
    }

    @Override
    public void estaFuncionando() {
        if (funcionando == true) {
            System.out.println("El ventilador sopla.");
        } else {
            System.out.println("El ventilador no sopla.");
        }
    }
}