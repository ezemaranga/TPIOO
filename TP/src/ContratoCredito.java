import java.util.Date;

public class ContratoCredito extends Contrato {
	
	String entidadEmisora;
	String numTarjeta;
	Date fechaVenc;
	
	public ContratoCredito(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato, String entidadEmisora, String numTarjeta, Date fechaVenc){
		super(cliente,abono,auto,cochera,numContrato);
		this.entidadEmisora = entidadEmisora;
		this.numTarjeta = numTarjeta;
		this.fechaVenc = fechaVenc;
		
	}
	
	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public void setFechaVenc(Date fechaVenc) {
		this.fechaVenc = fechaVenc;
	}

	
}
