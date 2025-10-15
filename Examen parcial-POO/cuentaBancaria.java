class cuentaBancaria {

    // encapsulamos los atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // constructor por defecto
    public cuentaBancaria() {
        this.titular = "Desconocido";
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;
    }
    // constructor con parametros
        public cuentaBancaria(String titular, String numeroCuenta, double saldo) {
            if (numeroCuenta.length() < 6) {
                System.out.println("El número de cuenta debe tener 6 o más caracteres.");
                this.numeroCuenta = "0000000000";
            } else {
                this.numeroCuenta = numeroCuenta;
            }

            if (titular == null || titular.trim().isEmpty()) {
                System.out.println("El nombre del titular no puede estar vacío.");
                this.titular = "Desconocido";
            } else {
                this.titular = titular;
            }
            if (saldo < -50) {
                System.out.println("El saldo no puede ser menor a -50.");
                this.saldo = 0.0;
            } else {
                this.saldo = saldo;
            }
    }

    // Metodos get y set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos del banco
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de deposito invalido.");
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && saldo - monto >= -50) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de retiro invalido o saldo insuficiente.");
        }
    }

    // Metodo toString para mostrar el estado de la cuenta
    @Override
    public String toString() {
        return "Titular: " + titular +
         ", Numero de Cuenta: " + numeroCuenta + 
         ", Saldo: " + saldo;
    }
}