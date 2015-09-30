import java.util.ArrayList;
import java.util.List;


public class Cliente {
	
	private String domicilio;
	private String dni;
	private String mail;
	private String telefono;
	private String nombre;
	private List<Auto> Autos;
	
	public List<Auto> getAutos() {
		return Autos;
	}

	public void setAutos(List<Auto> autos) {
		Autos = autos;
	}

	public Cliente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.Autos = new ArrayList<Auto>();
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void agregarAuto(Auto auto) {
		this.Autos.add(auto);		
	}

}
