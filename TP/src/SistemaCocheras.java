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
	

	/**
	 * Se elimina el cliente y sus contratos
	 * 
	 * @param dni
	 * @return true si elimino el cliente, o false si no existia
	 * 
	 */
	public boolean bajaCliente(String dni) {
		
		// obtengo el cliente
		Cliente cliente = buscarCliente(dni);
		
		// si existe, verifico sus contratos
		if(cliente != null) {
			
			// obtengo sus contratos
			List<Contrato> contratosCliente = buscarContratosCLiente(dni);
			
			for (Contrato contrato : contratosCliente) {
				// elimino sus coontratos
				bajaContrato(contrato.getNumeroContrato());
			}
			
			// elimino el cliente
			clientes.remove(cliente);
			return true;
		}
		
		return false;
	}
	

	/**
	 * Elimina el contrato
	 * 
	 * @param numeroContrato
	 */
	private void bajaContrato(long numeroContrato) {
		for(Contrato contrato : contratos) {
			if(contrato.getNumeroContrato() == numeroContrato) {
				contratos.remove(contrato);
			}
		}
		
	}

	/**
	 * Devuelve los contratos del cliente cuyo dni se recibe como parametro
	 * @param dni
	 * @return
	 */
	public List<Contrato> buscarContratosCLiente(String dni) {
		List<Contrato> contratosCliente = new ArrayList<Contrato>();
		for(Contrato contrato : contratos) {
			if (contrato.getCliente().getDni() == dni) {
				contratosCliente.add(contrato);
			}
		}
		return contratosCliente;
	}
	
	public void agregarAbono(String descripcion, double precio, String tamanioCochera) {
		Abono abono = new Abono(descripcion, precio, tamanioCochera);
		//alguna validacion supongo
		abonos.add(abono);
	}
	
	public void eliminarAbono(String descripcion, double precio, String tamanioCochera) {
		Abono abono = new Abono(descripcion, precio, tamanioCochera);
		//alguna validacion supongo
		abonos.add(abono);
	}
	
	public void crearCochera(int numero, String tamanio) {
		Cochera cochera = new Cochera(numero, tamanio);
		//alguna validacion supongo
		cocheras.add(cochera);
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
