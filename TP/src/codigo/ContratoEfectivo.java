package codigo;
public class ContratoEfectivo extends Contrato {
	
	public ContratoEfectivo(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato){
		super(cliente,abono,auto,cochera,numContrato);
		this.tipo = "Efectivo";
	}

}
