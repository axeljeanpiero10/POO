package Avances;

public class Main_Cliente {

	public static void main(String[] args) {
		
		// aplica el polimorfismo
		
		ClienteNatural perN = null;
		
		perN = new ClienteNatural(0, null, 0, null);
		perN.imprimir();
		System.out.println("El Codigo de persona es:"+ perN.getCodCliente());
		System.out.println("El Tipo de persona:"+ perN.getTipoCliente());
		System.out.println("Su dni es:"+ perN.getDni());
		System.out.println("Su nombre es:"+ perN.getNombre());
		
		System.out.println("--------------------------------");
		
		ClienteJuridico perJ = null;
		perJ = new ClienteJuridico(0, null, 0, null);
		perJ.imprimir();
		System.out.println("El Codigo de persona es:"+ perJ.getCodCliente());
		System.out.println("El Tipo de persona:"+ perJ.getTipoCliente());
		System.out.println("Su RUC es:"+ perJ.getRUC());
		System.out.println("Razon Social es:"+ perJ.getRazonSocial());
		
				

	}

}
