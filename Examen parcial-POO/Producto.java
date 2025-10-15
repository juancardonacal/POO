class producto {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor por defecto
    public producto() {
        this.codigo = "0000";
        this.descripcion = "Sin descripcion";
        this.cantidad = 0;
        this.precioUnitario = 0.0;  
    }

    // Constructor con parametros
    public producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("El código no puede estar vacío.");
            this.codigo = "0000";
        } else {
            this.codigo = codigo;
        }

        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("La descripción no puede estar vacía.");
            this.descripcion = "Sin descripcion";
        } else {
            this.descripcion = descripcion;
        }

        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }

        if (precio < 0) {
            System.out.println("El precio no puede ser negativo.");
            this.precioUnitario = 0.0;
        } else {
            this.precioUnitario = precioUnitario;
        }
    }
    // Metodos get y set
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    // Metodos del producto
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
public double aplicarDescuento(double porcentaje) {
    if (porcentaje < 0 || porcentaje > 50) {
        System.out.println("Porcentaje de descuento invalido.");
        return calcularSubtotal();
    }
    return calcularSubtotal() * (1 - porcentaje / 50.0);
}
    public void incrementarCantidad(int cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad a incrementar no puede ser negativa.");
        } else {
            this.cantidad += cantidad;
        }
    }
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + 
                "', descripcion='" + descripcion +
                "', cantidad=" + cantidad +
                ", precio unitario=" + precioUnitario +
                '}';
    }
}