public class ContratoCbu extends Contrato {

	String entidadBancaria;
	String cbu;
	
	public ContratoCbu(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato, String entidadBancaria, String  cbu){
		super(cliente,abono,auto,cochera,numContrato);
		this.entidadBancaria = entidadBancaria;
		this.cbu = cbu;

	}
	
	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}
	public void setCbu(String cbu) {
		this.cbu = cbu;
	}
	

}
