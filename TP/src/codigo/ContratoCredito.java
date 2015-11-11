package codigo;
import java.util.Date;

public class ContratoCredito extends Contrato {
	
	String entidadEmisora;
	String numTarjeta;
	Date fechaVencTarj;
	
	public ContratoCredito(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato, String entidadEmisora, String numTarjeta, Date fechaVencTarj){
		super(cliente,abono,auto,cochera,numContrato);
		this.tipo = "Credito";
		this.entidadEmisora = entidadEmisora;
		this.numTarjeta = numTarjeta;
		this.fechaVencTarj = fechaVencTarj;
		
	}
	
	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public void setFechaVencTarj(Date fechaVencTarj) {
		this.fechaVencTarj = fechaVencTarj;
	}

	
}
