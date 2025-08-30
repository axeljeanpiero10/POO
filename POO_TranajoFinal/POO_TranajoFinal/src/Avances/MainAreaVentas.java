	package Avances;

public class MainAreaVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido");
		System.out.println("----------------");
		AreaVentas v = new AreaVentas(123456789, "Herbalife" );		
		System.out.println("El codigo del area es:"+ v.getCodArea());
		System.out.println("El nombre del area es:"+ v.getNombArea());
		System.out.println(v.toString());
	}

}
