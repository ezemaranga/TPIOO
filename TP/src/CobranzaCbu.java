import java.util.Calendar;
import java.util.Date;

public final class CobranzaCbu extends Cobranza {

	String entidad;

	public CobranzaCbu(Contrato contrato, Calendar fechaPago, double monto) {
		super(contrato, fechaPago, monto);
		this.entidad = entidad;
	}

	private String getEntidad() {
		return entidad;
	}

	private void setEntidad(String entidad) {
		this.entidad = entidad;
	}

}
