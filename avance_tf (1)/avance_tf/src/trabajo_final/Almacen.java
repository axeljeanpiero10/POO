package trabajo_final;

import java.util.ArrayList;
import java.util.List;


//Aplicativo del almacenamiento de la empresa y  tambien de ventas

public class Almacen {
	
	private int codAlmacen;
	private int stock;
	private String descripcionProducto;
	
	//constuctor
	public Almacen(int codAlmacen, int stock, String descripcionProducto) {
		this.codAlmacen = codAlmacen;
		this.stock = stock;
		this.descripcionProducto = descripcionProducto;
		
	
		caracteristicas = new ArrayList<Almacen.Caracteristicas >();	
	}
	//composicion-aplicacion
	class Caracteristicas{
		String color; 
		double tamano;
		double peso;
		String consumo;
	}
	
	private List<Caracteristicas> caracteristicas;
	
	public void agregardC(String color,double tamano, double peso, String consumo){
		Caracteristicas ca = new Caracteristicas();
		ca.color = color;
		ca.tamano = tamano;
		ca.peso = peso;
		ca.consumo = consumo;
		caracteristicas.add(ca);
	}
	
	
	public int getCodAlmacen() {
		return codAlmacen;
	}
	public void setCodAlmacen(int codAlmacen) {
		this.codAlmacen = codAlmacen;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	public String toString() {
		
		String st =  "Codigo de almacen: " + codAlmacen +  " Stock :"+ stock +" Descriocion Producto: " + descripcionProducto;
		
		for (Caracteristicas caracteristicas : caracteristicas) {
				
			st += "\n" +"( "+ caracteristicas.color +" "+ caracteristicas.tamano +" "+  caracteristicas.peso +" "+ caracteristicas.consumo +" )";
		}
		
		return st;
		 
}
}
