public class Banco {
    public static void main ( String [] args ) {
        // Creacion del primer objeto ( Instancia )
        System.out.println (" --- Creando cuenta bancaria ---");
        cuentaBancaria cuenta1 = new cuentaBancaria("Juan Perez", "1234567", 100.0);
        // Uso del toString () y un getter
        System.out.println (" Datos iniciales : Titular: " + cuenta1.getTitular() + ", Numero de Cuenta: " + cuenta1.getNumeroCuenta() + ", Saldo: " + cuenta1.getSaldo());
        
        // Uso de un setter y un metodo de negocio
        cuenta1.setTitular("Juan P. Gomez");
        cuenta1.depositar(50.0);
        
        // Verificar estado con toString ()
        System.out.println (" Estado final : Titular: " + cuenta1.getTitular() + ", Numero de Cuenta: " + cuenta1.getNumeroCuenta() + ", Saldo: " + cuenta1.getSaldo());

        // Creacion de un segundo objeto
        System.out.println ("\n--- Creando segunda cuenta bancaria ---") ;
        cuentaBancaria cuenta2 = new cuentaBancaria("Maria Lopez", "7654321", 200.0);
        System.out.println (" Datos iniciales : Titular: " + cuenta2.getTitular() + ", Numero de Cuenta: " + cuenta2.getNumeroCuenta() + ", Saldo: " + cuenta2.getSaldo());
        cuenta2.depositar(100.0);  
        
        cuenta2.retirar(351.0);

    }
}