package Avances;

public class MainComprobanteInterface {

	public static void main(String[] args) {
		
		// interface
		//aplicamos el polimorfismo 
		
		double montoPagar = 10;
		ComprobanteInterfas c = null;  
		c= new BoletaInterfas();
		System.out.println("Monto a pagar boleta: " + c.montoPagar(montoPagar));
		//c = new FacturaI();
		//System.out.println("Monto a pagar factura: " + c.montoPagar(montoPagar));
		
		int cantProducto = 2;
		ComprobanteInterfas cP = null;
		cP = new BoletaInterfas();
		System.out.println("Cantidad de producto (Boleta): " + cP.cantProducto(cantProducto));
		//cP = new FacturaI();
		//System.out.println("Cantidad de producto (Factura): " + cP.cantProducto(cantProducto));
		
		
		double descuento = 3;
		ComprobanteInterfas d = null;
		d = new BoletaInterfas();
		System.out.println("El descuento es(BOleta): " + d.descuento(descuento));
		//d = new FacturaI();
		//System.out.println("El descuento es(Factura): " + d.descuento(descuento));
		
		
		
		
	}

}
