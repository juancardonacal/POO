class cuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    public cuentaBancaria() {
        this.titular = "Desconocido";
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;
    }

    public cuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (numeroCuenta.length() <= 6) {
            throw new IllegalArgumentException("El número de cuenta debe tener mas de 6 caracteres.");
        }

        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del titular no puede estar vacío.");
        }
        if (saldo < -50) {
            throw new IllegalArgumentException("El saldo no puede ser menor a -50.");
        }

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

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
}