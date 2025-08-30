package trabajo_final;

import java.util.ArrayList;
import java.util.List;



public class AreaVentas {
	
	private int codArea;
	private String nombArea;
	
	
	public AreaVentas(int codArea, String nombArea){
		this.codArea = codArea;
		this.nombArea = nombArea;	
		extra = new ArrayList<AreaVentas.Extra>();
	}
	
	
	class Extra{
		String direccion;
		double tama�oAlmacen;
		String coordenadas;
		String estado;
	}
	
	
	private List<Extra> extra;

	
	public void agregarextra(String direccion, double tama�oAlmacen, String coordenadas, String estado){
		
		Extra ex = new Extra();
		
		ex.direccion = direccion;
		ex.tama�oAlmacen = tama�oAlmacen;
		ex.coordenadas = coordenadas;
		ex.estado = estado;
		
		extra.add(ex);
	}
	
	public int getCodArea() {
		return codArea;
	}
	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}
	public String getNombArea() {
		return nombArea;
	}
	public void setNombArea(String nombArea) {
		this.nombArea = nombArea;
	}
	
	public String toString() {
		
		String str = "Codigo " + codArea + ", Area: " + nombArea;
			for (Extra extra : extra) {
			str += "\n" + extra.direccion + "(" + extra.tama�oAlmacen + "-"+ extra.coordenadas + "-" + extra.estado+")";
			
		}
			return str;
	}
}


