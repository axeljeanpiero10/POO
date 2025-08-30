package trabajo_final;

public class Cajero {
	
	private int codCajero;
	private String nombreDirector;
	private String apellidoDirector;
	private int codEncargado;

	//Constructor
	public Cajero(int codCajero, String nombreDirector, String apellidoDirector, int codEncargado) {
		this.codCajero = codCajero;
		this.nombreDirector= nombreDirector;
		this.apellidoDirector = apellidoDirector;
		this.codEncargado = codEncargado;
	
	}
	//Metodos get/set
	public int getCodCajero() {
		return codCajero;
	}
	public void setCodCajero(int codCajero) {
		this.codCajero = codCajero;
	}
	public String getNombreDirector() {
		return nombreDirector;
	}
	public void setNombreAutoridad(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	public String getApellidoDirector() {
		return apellidoDirector;
	}
	public void setApellidoDirector(String apellidoDirector) {
		this.apellidoDirector = apellidoDirector;
	}
	public int getCodEncargado() {
		return codEncargado;
	}
	public void setCodEncargado(int codEncargado) {
		this.codEncargado = codEncargado;
	}
	//Metodo toString sobre-escritura
	public String toString() {
		return "Codigo del cajero: " + codCajero + " Nombre Director: " + nombreDirector+ " Apellido Director: "+ apellidoDirector + " Codigo Encargado :"+ codEncargado;

}

}
