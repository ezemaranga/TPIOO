package EjercicioSwing;
public class AlumnoView 
{
	private String nombre;
	private String domicilio;
	private String telefono;
	
	
	
	public AlumnoView(String nombre, String domicilio, String telefono) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	
	

}
