
public class Cliente {
	
	private String domicilio;
	private String dni;
	private String mail;
	private String telefono;
	private String nombre;
	
	public Cliente(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
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

}
