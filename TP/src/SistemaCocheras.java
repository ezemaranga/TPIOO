import java.util.ArrayList;
import java.util.List;


public class SistemaCocheras {
	
	private List<Cliente> clientes;
	private List<Cochera> cocheras;
	private List<Abono> abonos;
	private List<Contrato> contratos;
	
	public SistemaCocheras() {
		clientes = new ArrayList<Cliente>();
		cocheras = new ArrayList<Cochera>();
		abonos = new ArrayList<Abono>();
		contratos = new ArrayList<Contrato>();
	}
	
	public boolean crearCliente(String dni, String nombre) {
		
		Cliente cliente = buscarCliente(dni);
		
		if(cliente == null) {
			clientes.add(new Cliente(dni, nombre));
			return true;
		}
		
		return false;
		
	}
	
	public Cliente buscarCliente(String dni) {
		
		for(Cliente cliente : clientes) {
			if(cliente.getDni().equals(dni)) {
				return cliente;
			}
		}
		
		return null;
	}
	
	public boolean bajaCliente(String dni) {
		
		Cliente cliente = buscarCliente(dni);
		
		if(cliente != null) {
			clientes.remove(cliente);
			return true;
		}
		
		return false;
	}
	
	public void crearAbono(String descripcion, double precio) {
		Abono abono = new Abono(descripcion, precio);
		//alguna validacion supongo
		abonos.add(abono);
	}
	
	public void crearCochera(int numero, String tamanio) {
		Cochera cochera = new Cochera(numero, tamanio);
		//alguna validacion supongo
		cocheras.add(cochera);
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

}
