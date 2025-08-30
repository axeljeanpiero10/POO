package Avances;



public class MainProducto {

	public static void main(String[] args) {
		
		Producto prod1 = new Producto("Gaseosa", 10001, 10.5);
		Producto prod2 = new Producto("Galleta", 10002,0.80);
		Producto prod3 = new Producto("Leche", 10003,3.8);
		
		TipoProducto cat = new TipoProducto("Bebidas");
		cat.agregarProducto(prod1);		
		TipoProducto cat2 = new TipoProducto("Golosina");
		cat2.agregarProducto(prod2);
		TipoProducto cat3 = new TipoProducto("Abarrote");
		cat3.agregarProducto(prod3);
		
		//Muestra el producto en consola
		cat.mostrarProducto();
		cat2.mostrarProducto();
		cat3.mostrarProducto();
		
	}


	}


