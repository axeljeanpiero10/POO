package Avances;

public class BoletaInterfas implements ComprobanteInterfas {

	@Override
	public double montoPagar(double MontoPagar) {
		// TODO Auto-generated method stub
		return MontoPagar*3.5;
	}

	@Override
	public int cantProducto(int cantProducto) {
		// TODO Auto-generated method stub
		return cantProducto*2;
	}

	@Override
	public double descuento(double descuento) {
		// TODO Auto-generated method stub
		return descuento*1.5;
	}

	
	

}
