package Avances;

public class Pago {
	
	private int codPago;
	private int codCompra;
	private int codVenta;
	
	
	public Pago(int codPago, int codCompra, int codVenta) {
		this.codPago = codPago;
		this.codCompra = codCompra;
		this.codVenta = codVenta;
		
	}
	public int getCodPago() {
		return codPago;
	}
	public void setCodTransaccion(int codPago) {
		this.codPago = codPago;
	}
	public int getCodCompra() {
		return codCompra;
	}
	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}
	public int getCodVenta() {
		return codVenta;
	}
	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}

	public String toString() {
		return "Codigo Transaccion: " + codPago + " Codigo de compra: " + codCompra+ " Codigo de venta: "+codVenta;
	

}
}
