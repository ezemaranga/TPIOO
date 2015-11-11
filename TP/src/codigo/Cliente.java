package codigo;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
	
	private String domicilio;
	private String dni;
	private String mail;
	private String telefono;
	private String nombre;
	private List<Auto> autos;

	public Cliente(String dni, String nombre, String mail, String telefono, String domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.mail = mail;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.autos = new ArrayList<Auto>();
	}
	
	
	public void agregarAuto(Auto auto) {
		this.autos.add(auto);		
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Auto> getAutos() {
		return autos;
	}


	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}


	public String getDni() {
		return dni;
	}

}
