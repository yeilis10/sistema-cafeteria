public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;

    public Cliente(String idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void realizarCompra(Venta v) {
        System.out.println("Cliente: " + nombre + " realizando compra...");
        v.registrarVenta();
    }
}
