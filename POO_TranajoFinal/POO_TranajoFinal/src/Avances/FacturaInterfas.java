package Avances;

public class FacturaInterfas implements ComprobanteInterfas{

	@Override
	public double montoPagar(double MontoPagar) {
		// TODO Auto-generated method stub
		return MontoPagar*2.5;
	}

	@Override
	public int cantProducto(int cantProducto) {
		// TODO Auto-generated method stub
		return cantProducto*3;
	}

	@Override
	public double descuento(double descuento) {
		// TODO Auto-generated method stub
		return descuento*1.8;
	}
 
}
