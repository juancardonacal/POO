public class Ejecutar {

    public static void main(String[] args) {

        Electrodomesticos miVentilador = new ventilador("LG", "V123", 150.0);
        Electrodomesticos miTelevisor = new televisor("Samsung", "T456", 500.0);

        miVentilador.encender();
        miVentilador.estaFuncionando();

        miTelevisor.encender();
        miTelevisor.estaFuncionando(); 

        miVentilador.apagar();
        miTelevisor.apagar();
    }
}