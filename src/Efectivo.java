import java.util.Date;

public class Efectivo extends Pago {

    public Efectivo(int idPago, double monto, Date fecha) {
        super(idPago, monto, fecha, "Efectivo");
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago en efectivo recibido correctamente.");
    }
}
 


