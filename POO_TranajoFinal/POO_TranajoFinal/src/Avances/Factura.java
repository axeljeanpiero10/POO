package Avances;

import java.time.LocalDate;

public class Factura extends Comprobante{
	private int ruc;
	private String razSocial;
	private String domicilio;
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(int cod, LocalDate fecha, double monto, int cantProducto, double descuento, int ruc,
			String razSocial, String domicilio) {
		super(cod, fecha, monto, cantProducto, descuento);
		this.ruc = ruc;
		this.razSocial = razSocial;
		this.domicilio = domicilio;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public String getRazSocial() {
		return razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void imprimir() {
		System.out.println("Imprimiendo Boleta");
		
	}
	
	
	
}
