package codigo;

public class Cochera {
	
	private int numero;
	private String tamanio;
	private boolean disponible;
	
	public Cochera(int numero, String tamanio) {
		this.numero = numero;
		this.tamanio = tamanio;
		this.disponible = true;
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

}
