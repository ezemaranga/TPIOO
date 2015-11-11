import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Main {
	
	public static void main(String[] args) {
		
		SistemaCocheras sistema = new SistemaCocheras();
		
		altaMockClientes(sistema);
		
		altaMockMapaDeCocheras(sistema);
		
		altaMockAbonos(sistema);
		
		
		
//		testeoBajaCliente(sistema);
//		
//		testeoBuscarCliente(sistema);
//		
//		testeoBuscarCocheraDisponible(sistema);
//		
//		testeoCambiarEstadoCochera(sistema);
//		
		testeoCrearContrato(sistema);
		
		testeoCobranzas(sistema);
		
		
	}

	private static void testeoCrearContrato(SistemaCocheras sistema) {
		sistema.crearContratoEfectivo("1", sistema.getAbonos().get(2), "ABC123");
		sistema.crearContratoCheque("1", sistema.getAbonos().get(2), "ABC123");
		sistema.crearContratoCredito("1", sistema.getAbonos().get(2), "ABC123", "Banco1", "123456", new Date());
		sistema.crearContratoCBU("1", sistema.getAbonos().get(2), "ABC123", "Banco1", "123456");
		System.out.println("----------CONTRATOS GENERADOS--------------");
		sistema.imprimitContratos();
	}
	
	private static void testeoCobranzas(SistemaCocheras sistema){
		//Setear la fecha con 10 días más y x meses menos que la fecha de hoy
		sistema.getContratos().get(2).setFechaContrato(new GregorianCalendar(2015,7,21));
		sistema.getContratos().get(3).setFechaContrato(new GregorianCalendar(2015,9,21));
		
		sistema.cobrarEfectivo(1, 300);
		sistema.cobrarCheque(1, 500, "Banco", "CH12345");
		sistema.cobrarCreditoBatch();
		sistema.cobrarCbuBatch();
		
		System.out.println("------COBRANZAS REALIZADAS--------");
		sistema.imprimirCobranzas();
	}

	private static void testeoBuscarCliente(SistemaCocheras sistema) {
		System.out.println("----------BUSCANDO CLIENTE DNI 5--------------");
		Cliente cliente = sistema.buscarCliente("5");
		System.out.println(cliente.getNombre() + " dni:" + cliente.getDni());
	}

	private static void testeoBajaCliente(SistemaCocheras sistema) {
		System.out.println("------------ELIMINANDO CLIENTE DNI 4 -------------");
		sistema.eliminarCliente("4");
		System.out.println("------------ELIMINANDO CLIENTE DNI 6 -------------");
		sistema.eliminarCliente("6");
		System.out.println("------------ELIMINANDO CLIENTE DNI 8 -------------");
		sistema.eliminarCliente("8");
		
		System.out.println("------------ CLIENTES ACTIVOS: -------------");
		sistema.imprimirClientes();
	}

	private static void altaMockClientes(SistemaCocheras sistema) {
		sistema.crearCliente("1", "Carlos", "", "", "");
		
		Cliente cliente = sistema.buscarCliente("1");
		cliente.agregarAuto(new Auto("ABC123", "Honda", "Civic", "Grande"));
		
		sistema.crearCliente("2", "Pepe", "", "", "");
		
		cliente = sistema.buscarCliente("2");
		cliente.agregarAuto(new Auto("YYY333", "Peugeot", "207", "Mediana"));
		
		sistema.crearCliente("3", "Maria", "", "", "");
		
		cliente = sistema.buscarCliente("3");
		cliente.agregarAuto(new Auto("ASD678", "Fiat", "600", "Chica"));
		
		sistema.crearCliente("4", "Ivan", "", "", "");
		sistema.crearCliente("5", "Ezequiel", "", "", "");
		sistema.crearCliente("6", "Tomas", "", "", "");
		sistema.crearCliente("7", "Eugenia", "", "", "");
		sistema.crearCliente("8", "Alan", "", "", "");
		sistema.crearCliente("9", "Migue", "", "", "");
		
		System.out.println("---------CLIENTES CREADOS-------------");
		sistema.imprimirClientes();
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
		
		System.out.println("-------COCHERAS CREADAS----------");
		sistema.imprimirCocheras();
	}
	
	private static void altaMockAbonos(SistemaCocheras sistema) {
		sistema.crearAbono("mensual", 800, "chica", 1);
		sistema.crearAbono("mensual", 1000, "mediana", 2);
		sistema.crearAbono("mensual", 1200, "grande", 3);
		sistema.crearAbono("quincenal", 500, "chica", 4);
		sistema.crearAbono("quincenal", 600, "mediana", 5);
		sistema.crearAbono("quincenal", 700, "grande", 6);
		
		System.out.println("------ABONOS CREADOS--------");
		sistema.imprimirAbonos();
	}
	
	private static void testeoBuscarCocheraDisponible(SistemaCocheras sistema) {
		System.out.println("----BUSCANDO COCHERA MEDIANA DISPONIBLE----");
		Cochera cochera = sistema.buscarCocheraDisponible("Mediana");
		System.out.println(cochera.getNumero() + " tamanio: " +cochera.getTamanio());
	}
	
	private static void testeoCambiarEstadoCochera(SistemaCocheras sistema) {
		System.out.println("----OCUPANDO COCHERA MEDIANA NUMERO 2----");
		sistema.cambiarEstadoCochera(2, false);
		testeoBuscarCocheraDisponible(sistema);
	}
	

}
