package Avances;

public abstract class Cliente {
	
	protected int codCliente;
	protected String tipoCliente;
	
	public abstract void imprimir();

	public Cliente(int codCliente, String tipoCliente) {
		super();
		this.codCliente = codCliente;
		this.tipoCliente = tipoCliente;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	
	
}
