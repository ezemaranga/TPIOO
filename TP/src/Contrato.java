public abstract class Contrato {
	
	protected Cliente cliente;
	protected Abono abono;
	protected Auto auto;
	protected Cochera cochera;
	protected int numeroContrato;
	
	public Contrato(Cliente cliente,Abono abono, Auto auto, Cochera cochera, int numContrato) {
		this.cliente = cliente;
		this.abono = abono;
		this.auto = auto;		
		this.cochera = cochera;
		this.numeroContrato = numContrato;
	}
	
	public Abono getAbono() {
		return abono;
	}
	public void setAbono(Abono abono) {
		this.abono = abono;
	}
	public Cochera getCochera() {
		return cochera;
	}
	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

}
