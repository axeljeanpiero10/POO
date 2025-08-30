package Avances;

public class AreaVentas {
	
	private int codArea;
	private String nombArea;
	
	public AreaVentas(int codArea, String nombArea){
		this.codArea = codArea;
		this.nombArea = nombArea;	
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
		return "Codigo " + codArea + ", Area: " + nombArea;
	}


}
