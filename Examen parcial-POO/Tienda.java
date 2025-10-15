public class Tienda {

    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("0001", "pollo", 5, 1500.0);
        Producto producto2 = new Producto("0002", "pescado", 3, 800.0);

        // Mostrar productos
        System.out.println(producto1);
        System.out.println(producto2);

        // Calcular subtotal
        System.out.println("Subtotal de " + producto1.getDescripcion() + ": $" + producto1.calcularSubtotal());
        System.out.println("Subtotal de " + producto2.getDescripcion() + ": $" + producto2.calcularSubtotal());

        // Aplicar descuento
        double descuento1 = producto1.aplicarDescuento(10); // 10% de descuento
        double descuento2 = producto2.aplicarDescuento(5);  // 5% de descuento
        System.out.println("Subtotal con descuento de " + producto1.getDescripcion() + ": $" + descuento1);
        System.out.println("Subtotal con descuento de " + producto2.getDescripcion() + ": $" + descuento2);

        // Incrementar cantidad
        producto1.incrementarCantidad(5);
        producto2.incrementarCantidad(10);
        System.out.println("Nueva cantidad de " + producto1.getDescripcion() + ": " + producto1.getCantidad());
        System.out.println("Nueva cantidad de " + producto2.getDescripcion() + ": " + producto2.getCantidad());
    }

}