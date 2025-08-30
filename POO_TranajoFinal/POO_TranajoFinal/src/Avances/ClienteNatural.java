package Avances;

public class ClienteNatural extends Cliente {

	protected int dni;
	protected String nombre;
	
	
	
	public ClienteNatural(int codCliente, String tipoCliente, int dni, String nombre) {
		super(codCliente, tipoCliente);
		this.dni = dni;
		this.nombre = nombre;
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



	@Override
	public void imprimir() {
		System.out.println("PERSONA NATURAL");
		
	}
	
	
	
	
	
	
	
	
}
