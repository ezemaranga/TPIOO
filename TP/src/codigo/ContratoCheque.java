package codigo;
public class ContratoCheque extends Contrato {

	public ContratoCheque(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato){
		super(cliente,abono,auto,cochera,numContrato);
		this.tipo = "Cheque";
	}
	
}
