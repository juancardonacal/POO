public class Banco {
    public static void main ( String [] args ) {
        // Creacion del primer objeto ( encapsulamiento )
        System.out.println (" --- Creando cuenta bancaria ---");
        cuentaBancaria cuenta1 = new cuentaBancaria("Willington Carabali", "1234567", 100.0);
        // Uso del toString () y un getter
        System.out.println (" Datos iniciales : Titular: " + cuenta1.getTitular() + ", Numero de Cuenta: " + cuenta1.getNumeroCuenta() + ", Saldo: " + cuenta1.getSaldo());

        // Uso de un setter y un metodo del banco
        cuenta1.setTitular("Willington C.");
        cuenta1.depositar(50.0);
        
        // Verificar estado con toString ()
        System.out.println (" Estado final : Titular: " + cuenta1.getTitular() + ", Numero de Cuenta: " + cuenta1.getNumeroCuenta() + ", Saldo: " + cuenta1.getSaldo());

        // Creacion de un segundo objeto
        System.out.println ("\n--- Creando segunda cuenta bancaria ---") ;
        cuentaBancaria cuenta2 = new cuentaBancaria("Marcela Rodrigues", "54421", 200.0);
        System.out.println (" Datos iniciales : Titular: " + cuenta2.getTitular() + ", Numero de Cuenta: " + cuenta2.getNumeroCuenta() + ", Saldo: " + cuenta2.getSaldo());

        // Comprobando el limite de sobregiro
        cuenta1.retirar(201.0);
        

        // Verificar estado final solo con toString ()
        System.out.println (" Estado final cuenta 1 : " + cuenta1.toString());
        System.out.println (" Estado final cuenta 2 : " + cuenta2.toString());

        // comprobando metodo set para hacer valida la segunda cuenta.
        cuenta2.setNumeroCuenta("4647874");


        // Verificando que la cuenta 2 ahora es valida.
        System.out.println (" Estado final cuenta 2 : " + cuenta2.toString());

    }
}