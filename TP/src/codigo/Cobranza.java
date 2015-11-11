package codigo;
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

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Calendar getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Calendar fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
