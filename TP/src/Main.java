
public class Main {
	
	public static void main(String[] args) {
		
		SistemaCocheras sistema = new SistemaCocheras();
		
		altaMockClientes(sistema);
		altaMockMapaDeCocheras(sistema);
		altaMockAbonos(sistema);
		
//		testeoBajaCliente(sistema);
//		testeoBuscarCliente(sistema);
		testeoCrearContrato(sistema);
		
		
		
		
		
	}
	

	private static void testeoCrearContrato(SistemaCocheras sistema) {
		Cliente cliente = sistema.buscarCliente("5");
		Auto auto = new Auto("ABC123", "Honda", "Civic");
		cliente.agregarAuto(auto);
		Abono abono = sistema.getAbonos().get(0);
		
		sistema.crearContrato(cliente, abono, auto, "efectivo");
		System.out.println(sistema.getContratos());
	}

	private static void testeoBuscarCliente(SistemaCocheras sistema) {
		System.out.println(
				sistema.buscarCliente("5").getNombre()
			);
	}

	private static void testeoBajaCliente(SistemaCocheras sistema) {
		for (Cliente cliente : sistema.getClientes()) {
			System.out.println(cliente.getNombre());
		}
		System.out.println("-------------------------");
		sistema.eliminarCliente("6");
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
	
	private static void altaMockMapaDeCocheras(SistemaCocheras sistema) {
		sistema.crearCochera(1, "Grande");
		sistema.crearCochera(2, "Mediana");
		sistema.crearCochera(3, "Chica");
		sistema.crearCochera(4, "Grande");
		sistema.crearCochera(5, "Chica");
		sistema.crearCochera(6, "Chica");
		sistema.crearCochera(7, "Grande");
		sistema.crearCochera(8, "Mediana");
		sistema.crearCochera(9, "Mediana");
		sistema.crearCochera(10, "Grande");
		sistema.crearCochera(11, "Chica");
	}
	
	private static void altaMockAbonos(SistemaCocheras sistema) {
		sistema.crearAbono("mensual", 800, "chica", 1);
		sistema.crearAbono("mensual", 1000, "mediana", 2);
		sistema.crearAbono("mensual", 1200, "grande", 3);
		sistema.crearAbono("quincenal", 500, "chica", 4);
		sistema.crearAbono("quincenal", 600, "mediana", 5);
		sistema.crearAbono("quincenal", 700, "grande", 6);
	}


}
