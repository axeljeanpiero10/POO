package trabajo_final;

public class Compra {
	
	private int codCompra;
	private int ruc;
	private String proveedor;
	private int CodSupervisor;
	
	//Constructor
	public Compra(int codCompra, int ruc, String proveedor, int codSupervisor) {
		this.codCompra = codCompra;
		this.ruc = ruc;
		this.proveedor = proveedor;
		this.CodSupervisor = codSupervisor;
	}
	
	//Metodo get/set
	public int getCodCompra() {
		return codCompra;
	}
	public void setCodCompra(int codCompra) {
		this.codCompra = codCompra;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getCodSupervisor() {
		return CodSupervisor;
	}
	public void setCodSupervisor(int codSupervisor) {
		CodSupervisor = codSupervisor;
	}
	
	// Metodo toString sobre-escritura
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de la compra: "+ codCompra + " RUC: "+ ruc + " Proveedor: " + proveedor + " Codigo del supervisor: "+ CodSupervisor;
	}


}
