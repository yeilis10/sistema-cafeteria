import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private List<Producto> productos;
    private Pago pago;

    public Venta(int idVenta, Date fecha) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public String getFecha() {
        return fecha.toString();
    }

    public void agregarProducto(Producto p) {
        if (p.getStock() > 0) {
            productos.add(p);
            System.out.println("Producto agregado: " + p.getNombreProducto());
        } else {
            System.out.println("No hay stock de: " + p.getNombreProducto());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void registrarVenta() {
        if (pago == null) {
            System.out.println("No hay pago registrado.");
            return;
        }

        System.out.println("\nProcesando pago...");
        pago.procesarPago();

        System.out.println("\nProductos comprados:");
        for (Producto p : productos) {
            System.out.println("- " + p.getNombreProducto() + " $" + p.getPrecio());
            p.reducirStock(1);
        }

        System.out.println("\nTotal a pagar: $" + calcularTotal());
        System.out.println("Venta registrada con éxito.");
    }
}

