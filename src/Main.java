import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CAFETERÍA ===\n");

    
        Cliente cliente1 = new Cliente("1", "Vanessa", "123456");
        Cliente cliente2 = new Cliente("2", "Carlos", "987654");

     
        Producto cafe = new Producto("P1", "Café", 3000, 10);
        Producto pan = new Producto("P2", "Pan", 2000, 5);
        Producto jugo = new Producto("P3", "Jugo", 4000, 8);
        Producto sandwich = new Producto("P4", "Sandwich", 7000, 3);
        Producto galleta = new Producto("P5", "Galleta", 1500, 0); 

      
        System.out.println("\n--- VENTA 1 (EFECTIVO) ---");

        Venta venta1 = new Venta(1, new Date());

        venta1.agregarProducto(cafe);
        venta1.agregarProducto(pan);
        venta1.agregarProducto(galleta);

        Pago pago1 = new Efectivo(1, venta1.calcularTotal(), new Date());
        venta1.setPago(pago1);

        cliente1.realizarCompra(venta1);

      
        System.out.println("\n--- VENTA 2 (TARJETA) ---");

        Venta venta2 = new Venta(2, new Date());

        venta2.agregarProducto(jugo);
        venta2.agregarProducto(sandwich);

        Pago pago2 = new Tarjeta(2, venta2.calcularTotal(), new Date(), "12345678");
        venta2.setPago(pago2);

        cliente2.realizarCompra(venta2);

        
       System.out.println("\n--- VENTA 3 (TARJETA INVÁLIDA) ---");

        Venta venta3 = new Venta(3, new Date());

        venta3.agregarProducto(cafe);

        Pago pago3 = new Tarjeta(3, venta3.calcularTotal(), new Date(), "123"); // inválida
        venta3.setPago(pago3);

        cliente1.realizarCompra(venta3);
    }
}

