import java.util.Date;

public class Tarjeta extends Pago {
    private String numeroTarjeta;

    public Tarjeta(int idPago, double monto, Date fecha, String numeroTarjeta) {
        super(idPago, monto, fecha, "Tarjeta");
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        if (numeroTarjeta.length() >= 8) {
            System.out.println("Pago con tarjeta aprobado.");
        } else {
            System.out.println("Tarjeta inválida.");
        }
    }
}
