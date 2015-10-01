import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class SistemaCocheras {
	
	private List<Cliente> clientes;
	private List<Cochera> cocheras;
	private List<Abono> abonos;
	private List<Contrato> contratos;
	private int numeroNuevoContrato = 1;
	
	public SistemaCocheras() {
		clientes = new ArrayList<Cliente>();
		cocheras = new ArrayList<Cochera>();
		abonos = new ArrayList<Abono>();
		contratos = new ArrayList<Contrato>();
	}
	


	public boolean crearCliente(String dni, String nombre, String mail, String telefono, String domicilio) {
		
		Cliente cliente = buscarCliente(dni);
		
		if(cliente == null) {
			clientes.add(new Cliente(dni, nombre, mail, telefono, domicilio));
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
			//clientes.remove(cliente);
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
	public boolean modificarCliente(String dni, String nombre, String mail, String telefono, String domicilio) {
		
		Cliente cliente = buscarCliente(dni);
		
		if(cliente != null) {
			if(!nombre.isEmpty()) {
				cliente.setNombre(nombre);
			}
			if(!mail.isEmpty()) {
				cliente.setMail(mail);
			}
			if(!telefono.isEmpty()) {
				cliente.setTelefono(telefono);
			}
			if(!domicilio.isEmpty()) {
				cliente.setDomicilio(domicilio);
			}
			if(!nombre.isEmpty()) {
				cliente.setNombre(nombre);
			}
			return true;
		}
		
		return false;
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
	

	public void crearContratoCheque(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato) {
		Contrato contrato = new ContratoCheque(cliente,abono,auto,cochera,numContrato);
		contratos.add(contrato);
	}
	public void crearContratoEfectivo(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato) {
		Contrato contrato = new ContratoEfectivo(cliente,abono,auto,cochera,numContrato);
		contratos.add(contrato);
	}
	public void crearContratoCbu(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato, String entidadBancaria, String cbu) {
		Contrato contrato = new ContratoCbu(cliente,abono,auto,cochera,numContrato,entidadBancaria,cbu);
		contratos.add(contrato);
	}
	public void crearContratoCredito(Cliente cliente, Abono abono, Auto auto, Cochera cochera, int numContrato, String entidadEmisora, String numTarjeta, Date fechaVenc) {
		Contrato contrato = new ContratoCredito(cliente,abono,auto,cochera,numContrato,entidadEmisora,numTarjeta,fechaVenc);
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
	
	
	
	public boolean generarNuevoContrato(String dniCliente, String patenteAuto, 
			String tipoContrato, Abono abono, String entidad, String numero, Date fecha) {
		
		Cliente cliente = buscarCliente(dniCliente);
		if (cliente == null) {
			return false;
		}
		
		Auto autoAGuardar = null;
		for (Auto auto : cliente.getAutos()) {
			if (auto.getPatente() == patenteAuto) {
				autoAGuardar = auto;
			}
		}
		if (autoAGuardar == null) {
			return false;
		}
		
		Cochera cochera = buscarCocheraDisponible(autoAGuardar.getTamanio());
		
		if(tipoContrato == "cheque") {
			crearContratoCheque(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato);
		}
		if(tipoContrato == "efectivo") {
			crearContratoEfectivo(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato);
		}
		if(tipoContrato == "cbu") {
			crearContratoCbu(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato, numero, entidad);
		}
		if(tipoContrato == "credito") {
			crearContratoCredito(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato, entidad, numero, fecha);
		}
		
		numeroNuevoContrato++;
		return true;

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
