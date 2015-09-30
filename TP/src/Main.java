
public class Main {
	
	public static void main(String[] args) {
		
		SistemaCocheras sistema = new SistemaCocheras();
		
		altaMockClientes(sistema);
		
		for (Cliente cliente : sistema.getClientes()) {
			System.out.println(cliente.getNombre());
		}
		
//		System.out.println(
//				sistema.buscarCliente("7").getNombre()
//		);
		
		System.out.println("-------------------------");
		
		sistema.bajaCliente("6");
		
		for (Cliente cliente : sistema.getClientes()) {
			System.out.println(cliente.getNombre());
		}
		
		
	}
	
	private static void altaMockClientes(SistemaCocheras sistema) {
		sistema.crearCliente("1", "Carlos");
		sistema.crearCliente("2", "Pepe");
		sistema.crearCliente("3", "Maria");
		sistema.crearCliente("4", "Ivan");
		sistema.crearCliente("5", "Ezequiel");
		sistema.crearCliente("6", "Tomas");
		sistema.crearCliente("7", "Eugenia");
		sistema.crearCliente("8", "Alan");
		sistema.crearCliente("9", "Migue");
	}
	
	private static void altaMockContratos(SistemaCocheras sistema) {
		
	}

}
