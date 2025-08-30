package Avances;

import java.time.LocalDate;

public class Boleta extends Comprobante{
	protected int dni;

	
	public Boleta(int cod, LocalDate fecha, double monto, int cantProducto, double descuento, int dni) {
		super(cod, fecha, monto, cantProducto, descuento);
		this.dni = dni;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public void imprimir() {
		System.out.println("Imprimiendo Boleta");
		
	}
	
	
	
	
}
