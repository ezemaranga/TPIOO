import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaCocheras {
	
	private List<Cliente> clientes;
	private List<Cochera> cocheras;
	private List<Abono> abonos;
	private List<Contrato> contratos;
	private List<Cobranza> cobranzas;
	private int numeroNuevoContrato = 1;
	
	//Constructor
	public SistemaCocheras() {
		clientes = new ArrayList<Cliente>();
		cocheras = new ArrayList<Cochera>();
		abonos = new ArrayList<Abono>();
		contratos = new ArrayList<Contrato>();
		cobranzas = new ArrayList<Cobranza>();
	}
	
	//Getters y Setters
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Cochera> getCocheras() {
		return cocheras;
	}

	public void setCocheras(List<Cochera> cocheras) {
		this.cocheras = cocheras;
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

	private List<Cobranza> getCobranzas() {
		return cobranzas;
	}

	private void setCobranzas(List<Cobranza> cobranzas) {
		this.cobranzas = cobranzas;
	}

	//ABM de Clientes
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

	//ABM de Cocheras
	public void crearCochera(int numero, String tamanio) {
		Cochera cochera = new Cochera(numero, tamanio);
		//alguna validacion supongo
		cocheras.add(cochera);
	}
	
	public void eliminarCochera(int numero) {
		for(Cochera cochera : cocheras) {
			if(cochera.getNumero() == numero) {
				cocheras.remove(cochera);
				break;
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
	
	public void cambiarEstadoCochera(int numero, boolean disponible) {
		for (Cochera cochera : cocheras) {
			if(cochera.getNumero() == numero) {
				cochera.setDisponible(disponible);
			}
		}
	}
	
	//ABM de Abonos
	public void crearAbono(String descripcion, double precio, String tamanioCochera, int codigo) {
		Abono abono = new Abono(descripcion, precio, tamanioCochera, codigo);
		//alguna validacion supongo
		abonos.add(abono);
	}
	
	public void eliminarAbono(int codigo) {
		for(Abono abono : abonos) {
			if(abono.getCodigo() == codigo) {
				abonos.remove(abono);
				break;
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
	
	//ABM de Contratos
	public boolean crearContratoCheque(String dniCliente, Abono abono, String patenteAuto) {
		//busco el cliente
		Cliente cliente = buscarCliente(dniCliente);
		if (cliente == null){
			return false;
		}
		
		//busco el auto del cliente
		Auto autoAGuardar = null;
		for (Auto auto : cliente.getAutos()) {
			if (auto.getPatente() == patenteAuto) {
				autoAGuardar = auto;
			}
		}
		//busco una cochera
		Cochera cochera = buscarCocheraDisponible(autoAGuardar.getTamanio());
		//si se cumplen las condiciones creo el contrato
		if (autoAGuardar == null || cochera == null)
			return false;
		Contrato contrato = new ContratoCheque(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato);
		cambiarEstadoCochera(cochera.getNumero(), false);
		contratos.add(contrato);
		numeroNuevoContrato++;
		return (contrato != null);	
	}
	
	public boolean crearContratoEfectivo(String dniCliente, Abono abono, String patenteAuto) {
		//busco el cliente
		Cliente cliente = buscarCliente(dniCliente);
		if (cliente == null){
			return false;
		}
		//busco el auto del cliente
		Auto autoAGuardar = null;
		for (Auto auto : cliente.getAutos()) {
			if (auto.getPatente() == patenteAuto) {
				autoAGuardar = auto;
			}
		}
		//busco una cochera
		Cochera cochera = buscarCocheraDisponible(autoAGuardar.getTamanio());
		//si se cumplen las condiciones creo el contrato
		if (autoAGuardar == null || cochera == null)
			return false;
		Contrato contrato = new ContratoEfectivo(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato);
		cambiarEstadoCochera(cochera.getNumero(), false);
		contratos.add(contrato);
		numeroNuevoContrato++;
		return (contrato != null);
	}
	
	public boolean crearContratoCBU(String dniCliente, Abono abono, String patenteAuto, String entidad, String nroCBU) {
		//busco el cliente
		Cliente cliente = buscarCliente(dniCliente);
		if (cliente == null){
			return false;
		}
		
		//busco el auto del cliente
		Auto autoAGuardar = null;
		for (Auto auto : cliente.getAutos()) {
			if (auto.getPatente() == patenteAuto) {
				autoAGuardar = auto;
			}
		}
		//busco una cochera
		Cochera cochera = buscarCocheraDisponible(autoAGuardar.getTamanio());
		//si se cumplen las condiciones creo el contrato
		if (autoAGuardar == null || cochera == null)
			return false;
		Contrato contrato = new ContratoCbu(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato, entidad, nroCBU);
		cambiarEstadoCochera(cochera.getNumero(), false);
		contratos.add(contrato);
		numeroNuevoContrato++;
		return (contrato != null);	
	}
	
	public boolean crearContratoCredito(String dniCliente, Abono abono, String patenteAuto, String entidad, String nroTarjeta, Date fechaVenc) {
		//busco el cliente
		Cliente cliente = buscarCliente(dniCliente);
		if (cliente == null){
			return false;
		}
		
		//busco el auto del cliente
		Auto autoAGuardar = null;
		for (Auto auto : cliente.getAutos()) {
			if (auto.getPatente() == patenteAuto) {
				autoAGuardar = auto;
			}
		}
		//busco una cochera
		Cochera cochera = buscarCocheraDisponible(autoAGuardar.getTamanio());
		//si se cumplen las condiciones creo el contrato
		if (autoAGuardar == null || cochera == null)
			return false;
		Contrato contrato = new ContratoCredito(cliente, abono, autoAGuardar, cochera, numeroNuevoContrato, entidad, nroTarjeta, fechaVenc);
		cambiarEstadoCochera(cochera.getNumero(), false);
		contratos.add(contrato);
		numeroNuevoContrato++;
		return (contrato != null);
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
	
	public boolean eliminarContrato(int numeroContrato) {
		Contrato contrato = buscarContrato(numeroContrato);
		if (contrato != null) {
			contratos.remove(contrato);
			return true;
		}
		return false;
	}
	
	private Contrato buscarContrato(int numeroContrato) {
		for(Contrato contrato : contratos) {
			if(contrato.getNumeroContrato() == numeroContrato) {
				return contrato;
			}
		}
		return null;
	}

	//Cobranzas
	public boolean cobrarEfectivo(int numeroContrato, double monto){
		//busco el contrato
		Contrato cont = buscarContrato(numeroContrato);
		//Creo la cobranza
		if(cont != null){
			Cobranza cobranza = new CobranzaEfectivo(cont, new Date(), monto);
			cobranzas.add(cobranza);
			return true;
		}
		return false;
	}
	public boolean cobrarCheque(int numeroContrato, double monto, String entidadEmisora, String numCheque){
		//busco el contrato
		Contrato cont = buscarContrato(numeroContrato);
		//Creo la cobranza
		if(cont != null){
			Cobranza cobranza = new CobranzaCheque(cont, new Date(), monto, entidadEmisora, numCheque);
			cobranzas.add(cobranza);
			return true;
		}
		return false;
	}
	public boolean cobrarCredito(int numeroContrato, double monto){
		//HAY QUE AUTOMATIZAR ESTO!
		return false;
	}
	public boolean cobrarCbu(int numeroContrato, double monto){
		//HAY QUE AUTOMATIZAR ESTO!
		return false;
	}
	
	//Impresiones
	public void imprimirClientes() {
		for(Cliente cliente : clientes) {
			System.out.println(cliente.getNombre() + " dni: " + cliente.getDni());
		}
	}
	
	public void imprimirCocheras() {
		for(Cochera cochera : cocheras) {
			System.out.println(cochera.getNumero() + " disponible : " + cochera.isDisponible() + " tamanio:" + cochera.getTamanio());
		}
	}
	
	public void imprimirAbonos() {
		for(Abono abono : abonos) {
			System.out.println(abono.getDescripcion() + " precio : " + abono.getPrecio() + " tamanio: " + abono.getTamanioCochera());
		}
	}
	
	public void imprimitContratos() {
		for(Contrato contrato : contratos) {
			System.out.println(contrato.getNumeroContrato() + " abono: " + contrato.getAbono().getDescripcion() +
							  " cliente: " + contrato.getCliente().getNombre() + " cochera: " + contrato.getCochera().getNumero());
		}
	}

}
