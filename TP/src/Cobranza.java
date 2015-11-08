import java.util.Calendar;
import java.util.Date;

public abstract class Cobranza {
	
	protected Contrato contrato;
	protected Calendar fechaPago;
	protected double monto;
	
	public Cobranza(Contrato contrato, Calendar fechaPago, double monto) {
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

	protected Calendar getFechaPago() {
		return fechaPago;
	}

	protected void setFechaPago(Calendar fechaPago) {
		this.fechaPago = fechaPago;
	}

	protected double getMonto() {
		return monto;
	}

	protected void setMonto(double monto) {
		this.monto = monto;
	}

}
