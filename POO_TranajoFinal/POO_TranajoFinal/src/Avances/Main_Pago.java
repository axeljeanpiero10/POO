package Avances;

public class Main_Pago {

	public static void main(String[] args) {
		
		Pago tran = new Pago(1111, 10001, 2468);		
		System.out.println("El Codigo Pago es:"+ tran.getCodPago());
		System.out.println("Codigo de compra es:"+ tran.getCodCompra());
		System.out.println("Codigo de venta es:"+ tran.getCodVenta());
		System.out.println(tran.toString());
		
		
		

	}

}
