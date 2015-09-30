
public class Cochera {
	
	private int numero;
	private String tamanio;
	private boolean disponible;
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Cochera(int numero, String tamanio) {
		this.numero = numero;
		this.tamanio = tamanio;
		this.disponible = true;
	}

}
