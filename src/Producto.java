public class Producto {
    private String idProducto;
    private String nombreProducto;
    private double precio;
    private int stock;

    public Producto(String idProducto, String nombreProducto, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente de " + nombreProducto);
        }
    }
}

