package Avances;

import java.time.LocalDate;

public abstract class Comprobante {
	protected int cod;
	protected LocalDate fecha;
	protected double monto;
	protected int cantProducto;
	protected double descuento;
	
	public  abstract void imprimir();
	
	//Constructores
	public Comprobante() {
		
	}

	public Comprobante(int cod, LocalDate fecha, double monto, int cantProducto, double descuento) {
		super();
		this.cod = cod;
		this.fecha = fecha;
		this.monto = monto;
		this.cantProducto = cantProducto;
		this.descuento = descuento;
	}

	//getter and setter
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getCantProducto() {
		return cantProducto;
	}

	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Fecha: " + fecha + " Codigo de comprobante: " + cod +  " Cantidad de producto: "+ cantProducto +" Monto a pagar:: " + monto+ " Descuento:"+ descuento;
	}

	
}
