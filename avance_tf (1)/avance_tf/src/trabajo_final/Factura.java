package trabajo_final;

public class Factura extends Cliente{
	
	protected int codFactura;
	
	public Factura(int codCliente, String tipoCliente, int rUC, int dni, String nombre, String razonSocial,int codFactura) {
		super(codCliente, tipoCliente, rUC, dni, nombre, razonSocial);
		this.codFactura = codFactura;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Codigo de Factura: "+ codFactura;
	}

	public int getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(int codFactura) {
		this.codFactura = codFactura;
	}

	

}
