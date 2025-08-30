package trabajo_final;

public class Venta {
	
	private int codVenta;
	private int cantidadProducto;
	private double montoPagar;
	private double descuento;
	

	public Venta(int codVenta, int cantidadProducto, double montoPagar, double descuento) {
		super();
		this.codVenta = codVenta;
		this.cantidadProducto = cantidadProducto;
		this.montoPagar = montoPagar;
		this.descuento = descuento;
		
	}
	public int getCodVenta() {
		return codVenta;
	}
	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public double getMontoPagar() {
		return montoPagar;
	}
	public void setMontoPagar(double montoPagar) {
		this.montoPagar = montoPagar;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public String toString() {
		return "Codigo de venta: " + codVenta +  " Cantidad de producto: "+ cantidadProducto +" Monto a pagar:: " + montoPagar+ " Descuento:"+ descuento;

	
}

}
