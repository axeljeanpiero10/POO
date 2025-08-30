package Avances;

public class MainAlmacen {

	public static void main(String[] args) {
		
		Almacen al = new Almacen(13579, 100 , "Yogurt");		
		System.out.println("El codigo del area es:"+ al.getCodAlmacen());
		System.out.println("El stock es:"+ al.getStock());
		System.out.println("Descrpcion Producto:"+ al.getDescripcionProducto());
		System.out.println(al.toString());

	}

}
