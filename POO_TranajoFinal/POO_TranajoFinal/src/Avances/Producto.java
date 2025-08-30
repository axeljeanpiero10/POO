package Avances;

public class Producto {
	
	private String nombProducto;
	private int codigo;
	private double precio;
	
	
	
	public Producto(String nombProducto, int codigo, double precio) {
	
		this.nombProducto = nombProducto;
		this.codigo = codigo;
		this.precio = precio;
		
	}
	public String getNombProducto() {
		return nombProducto;
	}
	public void setNombProducto(String nombProducto) {
		this.nombProducto = nombProducto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
