import java.util.Date;

public abstract class Cobranza {
	
	protected Contrato contrato;
	protected Date fechaPago;
	protected double monto;
	
	public Cobranza(Contrato contrato, Date fechaPago, double monto) {
		super();
		this.contrato = contrato;
		this.fechaPago = fechaPago;
		this.monto = monto;
	}

	protected Contrato getContrato() {
		return contrato;
	}

	protected void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	protected Date getFechaPago() {
		return fechaPago;
	}

	protected void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	protected double getMonto() {
		return monto;
	}

	protected void setMonto(double monto) {
		this.monto = monto;
	}

}
