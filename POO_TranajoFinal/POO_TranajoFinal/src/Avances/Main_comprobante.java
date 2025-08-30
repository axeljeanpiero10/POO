package Avances;

public class Main_comprobante {

	public static void main(String[] args) {
		Comprobante com = null;
		com = new Boleta(00001,null,35.0,5,0.0,73350578);
		com.imprimir();
		System.out.println("El Codigo Boleta es: "+ com.getCod());
		System.out.println("La cantidad de producto: "+ com.getCantProducto());
		System.out.println("El monto a pagar es: "+ com.getMonto());
		System.out.println("El descuento es: "+ com.getDescuento());
		System.out.println("El DNI es: ");
		System.out.println(com.toString());
		
		com = new Factura(00002,null,35.0,3,0,1073350578,"Klarita Mogollon","");
		com.imprimir();
		System.out.println("El Codigo Factura es:"+ com.getCod());
		System.out.println("La cantidad de producto:"+ com.getCantProducto());
		System.out.println("El monto a pagar es:"+ com.getMonto());
		System.out.println("El descuento es:"+ com.getDescuento());
		System.out.println("");
		System.out.println(com.toString());
		
		
		
	}

}
