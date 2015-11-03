import java.util.Date;

public final class CobranzaCheque extends Cobranza {

	String entidadEmisora;
	String nroCheque;
	
	public CobranzaCheque(Contrato contrato, Date fechaPago, double monto,String entidadEmisora, String nroCheque) {
		super(contrato, fechaPago, monto);
		this.entidadEmisora = entidadEmisora;
		this.nroCheque = nroCheque;
	}

	private String getEntidadEmisora() {
		return entidadEmisora;
	}

	private void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	private String getNroCheque() {
		return nroCheque;
	}

	private void setNroCheque(String nroCheque) {
		this.nroCheque = nroCheque;
	}

	
}
