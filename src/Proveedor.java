public class Proveedor {
    private String idProveedor;
    private String contacto;
    private String nombre;

    public Proveedor(String idProveedor, String contacto, String nombre) {
        this.idProveedor = idProveedor;
        this.contacto = contacto;
        this.nombre = nombre;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarCompra() {
        System.out.println("Compra registrada al proveedor: " + nombre);
    }
}

