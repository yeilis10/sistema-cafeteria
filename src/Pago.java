import java.util.Date;

public abstract class Pago {
    protected int idPago;
    protected double monto;
    protected Date fecha;
    protected String tipoPago;

    public Pago(int idPago, double monto, Date fecha, String tipoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getEstado() {
        return "Pago procesado";
    }

    public abstract void procesarPago();
}

