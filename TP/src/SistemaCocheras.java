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
	public boolean eliminarCliente(String dni) {
		
		// obtengo el cliente
		Cliente cliente = buscarCliente(dni);
		
		// si existe, verifico sus contratos
		if(cliente != null) {
			
			// obtengo sus contratos
			List<Contrato> contratosCliente = buscarContratosCliente(dni);
			
			for (Contrato contrato : contratosCliente) {
				// elimino sus coontratos
				eliminarContrato(contrato.getNumeroContrato());
			}
			
			// elimino el cliente
			clientes.remove(cliente);
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

	
	public void crearCochera(int numero, String tamanio) {
		Cochera cochera = new Cochera(numero, tamanio);
		//alguna validacion supongo
		cocheras.add(cochera);
	}
	public void eliminarCochera(int numero) {
		for(Cochera cochera : cocheras) {
			if(cochera.getNumero() == numero) {
				cocheras.remove(cochera);
			}
		}
	}
	public Cochera buscarCocheraDisponible(String tamanio) {
		for(Cochera cochera : cocheras) {
			if(cochera.getTamanio() == tamanio && cochera.isDisponible()) {
				return cochera;
			}
		}
		return null;
	}
	
	
	public void crearAbono(String descripcion, double precio, String tamanioCochera, int codigo) {
		Abono abono = new Abono(descripcion, precio, tamanioCochera, codigo);
		//alguna validacion supongo
		abonos.add(abono);
	}
	public void eliminarAbono(int codigo) {
		for(Abono abono : abonos) {
			if(abono.getCodigo() == codigo) {
				abonos.remove(abono);
			}
		}
	}
	public void modificarPrecioAbono(int codigo, int nuevoPrecio) {
		for(Abono abono : abonos) {
			if(abono.getCodigo() == codigo) {
				abono.setPrecio(nuevoPrecio);
			}
		}
	}
	

	public void crearContrato(Cliente cliente, Abono abono, Auto auto, String tipoContrato) {
		
		Contrato contrato = null;
		if (tipoContrato.equals("cheque")) {
			contrato = new ContratoCheque();
		}
		if (tipoContrato.equals("efectivo")) {
			contrato = new ContratoEfectivo();
		}
		if (tipoContrato.equals("cbu")) {
			contrato = new ContratoCbu();
		}
		if (tipoContrato.equals("credito")) {
			contrato = new ContratoCredito();
		}
		
		contratos.add(contrato);
	}
	public void eliminarContrato(long numeroContrato) {
		for(Contrato contrato : contratos) {
			if(contrato.getNumeroContrato() == numeroContrato) {
				contratos.remove(contrato);
			}
		}	
	}
	public List<Contrato> buscarContratosCliente(String dni) {
		List<Contrato> contratosCliente = new ArrayList<Contrato>();
		for(Contrato contrato : contratos) {
			if (contrato.getCliente().getDni() == dni) {
				contratosCliente.add(contrato);
			}
		}
		return contratosCliente;
	}
	
	
	

	
	

	
	
	
	
	

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Abono> getAbonos() {
		return abonos;
	}

	public void setAbonos(List<Abono> abonos) {
		this.abonos = abonos;
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

}
