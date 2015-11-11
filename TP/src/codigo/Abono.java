package codigo;

public class Abono {
	
	private int codigo;
	private String descripcion;
	private double precio;
	private String tamanioCochera;
	
	public Abono(String descripcion, double precio, String tamanioCochera, int codigo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tamanioCochera = tamanioCochera;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTamanioCochera() {
		return tamanioCochera;
	}

	public void setTamanioCochera(String tamanio) {
		this.tamanioCochera = tamanio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
