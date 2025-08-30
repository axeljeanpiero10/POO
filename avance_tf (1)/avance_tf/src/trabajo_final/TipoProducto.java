package trabajo_final;

import java.util.ArrayList;
import java.util.List;

public class TipoProducto {
	
	private String nombre;
	
	
	private List<Producto> productos;
	
	public TipoProducto(String nombre) {
		this.nombre = nombre;
		productos = new ArrayList<Producto>();
	}

	
	public TipoProducto() {
		productos = new ArrayList<Producto>();
	}
	public void agregarProducto(Producto prod) {
		productos.add(prod);
	}

	public void mostrarProducto() {
		System.out.println("Tipo Producto: " + nombre);
		for (Producto prod : productos) {
			System.out.println("Nombre: "+ prod.getNombProducto() + " codigo: " + prod.getCodigo() + " Precio:" + prod.getPrecio());
		}
	}

}
