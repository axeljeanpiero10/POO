package Avances;

public class ClienteJuridico extends Cliente {

	protected int RUC;
	protected String razonSocial;
	
	public ClienteJuridico(int codcliente, String tipoCliente, int rUC, String razonSocial) {
		super(codcliente, tipoCliente);
		RUC = rUC;
		this.razonSocial = razonSocial;
	}

	

	public int getRUC() {
		return RUC;
	}



	public void setRUC(int rUC) {
		RUC = rUC;
	}



	public String getRazonSocial() {
		return razonSocial;
	}



	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}



	@Override
	public void imprimir() {
		System.out.println("PERSONA JURIDICO");
		
	}
	
	
	
	

		
	}

	
