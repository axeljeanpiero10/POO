package trabajo_final;

public class Boleta extends Cliente { 	
	
	protected int codBoleta;
	
	public Boleta(int codCliente, String tipoCliente, int rUC, int dni, String nombre, String razonSocial, int codBoleta) {
		super(codCliente, tipoCliente, rUC, dni, nombre, razonSocial);
		this.codBoleta=codBoleta;
	}
	//metodo toString sobre-escrito
	@Override
	public String toString() {
		return super.toString() + " Codigo de Boleta: " +codBoleta;
	}


	public int getCodBoleta() {
		return codBoleta;
	}
	public void setCodBoleta(int codBoleta) {
		this.codBoleta = codBoleta;
	}

}


