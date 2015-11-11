package codigo;
import java.util.Date;


public class Auto {

	private String patente;
	private String marca;
	private String modelo;
	private String tamanio;
	private Date fechaEntrada;
	
	public Auto(String patente, String marca, String modelo, String tamanio) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.tamanio = tamanio;
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

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
}
