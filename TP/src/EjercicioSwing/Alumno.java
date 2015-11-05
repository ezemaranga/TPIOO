package EjercicioSwing;
public class Alumno 
{
	private String nombre;
	private String domicilio;
	private String telefono;
	
	public Alumno (String n, String d, String t)
	{
		nombre = n;
		domicilio = d;
		telefono = t;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public AlumnoView getView()
	{
		return new AlumnoView(nombre,domicilio,telefono);
	}
	

}
