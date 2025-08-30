package trabajo_final;

public class Transaccion {
	
	private int codTransaccion;
	private int codCompra;
	private int codVenta;
	
	
	public Transaccion(int codTransaccion, int codCompra, int codVenta) {
		this.codTransaccion = codTransaccion;
		this.codCompra = codCompra;
		this.codVenta = codVenta;
	}
	
	public int getCodTransaccion() {
		return codTransaccion;
	}
	public void setCodTransaccion(int codTransaccion) {
		this.codTransaccion = codTransaccion;
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
		return "Codigo Transaccion: " + codTransaccion + " Codigo de compra: " + codCompra+ " Codigo de venta: "+codVenta;
	

}

}
