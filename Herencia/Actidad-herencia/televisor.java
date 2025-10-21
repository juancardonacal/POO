public class televisor extends Electrodomesticos {

    public televisor(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    public void encender() {
        System.out.println("El televisor está encendido.");
    }

    public void apagar() {
        System.out.println("El televisor está apagado.");
    }

    @Override
    public void estaFuncionando() {
        if (funcionando == true) {
            System.out.println("El televisor está mostrando imágenes.");
        } else {
            System.out.println("El televisor no está mostrando imágenes.");
        }
    }
}
