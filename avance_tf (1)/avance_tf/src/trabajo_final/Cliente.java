package trabajo_final;

public class Cliente {
	//general
	
	protected int codCliente;
	protected String tipoCliente;
	protected int RUC;
	protected int dni;
	protected String nombre;
	protected String razonSocial;
	
	// contructor
	public Cliente(int codCliente, String tipoCliente, int rUC, int dni, String nombre, String razonSocial) {
		super();
		this.codCliente = codCliente;
		this.tipoCliente = tipoCliente;
		this.RUC = rUC;
		this.dni = dni;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
	}
	
	//Metodo toString sobre-escritura
	@Override
	public String toString() {
		String str = "";
		str+= "Codigo de Cliente: "+ codCliente + " Tipo Cliente: "+ tipoCliente+ " RUC: " + RUC + " DNI: "+ dni + " Nombre: "+ nombre+ " Razon Social: " +razonSocial;
		return str;
		}

	public int getCodPersona() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoPersona(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public int getRUC() {
		return RUC;
	}

	public void setRUC(int rUC) {
		RUC = rUC;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

}
