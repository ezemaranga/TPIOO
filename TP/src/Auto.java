import java.util.Date;


public class Auto {

	private String patente;
	private String marca;
	private String modelo;
	private Date fechaEntrada;
	
	public Auto(String patente, String marca, String modelo) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
}
