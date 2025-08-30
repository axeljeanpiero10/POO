package trabajo_final;

public class Vendedor {

	private int codVendedor;
	private String nombreVendedor;
	private String apellidoVendedor;
	private int codArea;
	
	public Vendedor(int codVendedor, String nombreAutoridad, String apellidoAutoridad, int codArea) {
		this.codVendedor = codVendedor;
		this.nombreVendedor = nombreAutoridad;
		this.apellidoVendedor = apellidoAutoridad;
		this.codArea = codArea;
		
	}
	
	
	
	public int getCodVendedor() {
		return codVendedor;
	}



	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}



	public String getNombreVendedor() {
		return nombreVendedor;
	}



	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}



	public String getApellidoVendedor() {
		return apellidoVendedor;
	}



	public void setApellidoVendedor(String apellidoVendedor) {
		this.apellidoVendedor = apellidoVendedor;
	}



	public int getCodArea() {
		return codArea;
	}



	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}



	@Override
	public String toString() {
	return "Codigo del Vendedor: "+ codVendedor + " Nombre: "  + nombreVendedor + " Apellido: " + apellidoVendedor+ " Codigo del Area: " + codArea ;
			
	}
	

}
