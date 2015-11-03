import java.util.Date;

public final class CobranzaCredito extends Cobranza {

	String entidad;
	
	public CobranzaCredito(Contrato contrato, Date fechaPago, double monto) {
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
