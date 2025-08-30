package Avances;

public class Almacen {
	
	private int codAlmacen;
	private int stock;
	private String descripcionProducto;
	
	public Almacen(int codAlmacen, int stock, String descripcionProducto) {
		this.codAlmacen = codAlmacen;
		this.stock = stock;
		this.descripcionProducto = descripcionProducto;
		
	}
	public int getCodAlmacen() {
		return codAlmacen;
	}
	public void setCodAlmacen(int codAlmacen) {
		this.codAlmacen = codAlmacen;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	public String toString() {
		return "Codigo de almacen: " + codAlmacen +  " Stock :"+ stock +" Descriocion Producto: " + descripcionProducto;

}
}
