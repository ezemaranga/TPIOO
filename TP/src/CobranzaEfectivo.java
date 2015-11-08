import java.util.Calendar;
import java.util.Date;

public final class CobranzaEfectivo extends Cobranza {

	public CobranzaEfectivo(Contrato contrato, Calendar fechaPago, double monto) {
		super(contrato, fechaPago, monto);
	}

}
