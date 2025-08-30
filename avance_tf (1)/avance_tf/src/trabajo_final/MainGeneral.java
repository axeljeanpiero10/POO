package trabajo_final;
public class MainGeneral {

	public static void main(String[] args) {
		
		
		// Area Ventas -arnold
		System.out.println("Bienvenido");
		System.out.println("----------------");
		AreaVentas v = new AreaVentas(123456789, "MiniMarket" );		
		v.agregarextra("Av. del Ejército 945 - Miraflores", 820, "-16.382074, -71.511087", "Activo");
		System.out.println(v);
		
		
		System.out.println("**************************************************");
		
		// Almacen arnold
		Almacen al = new Almacen(13579, 100 , "Refresco");
		al.agregardC("roja", 7.6, 250, "consumible");
		System.out.println(al);
		System.out.println("**************************************************");
		
		//Aplicativo-boleta - piero
		System.out.println("Herencia boleta - Cliente ");
		Boleta bol = new Boleta(123456789,"Natural",0,78945562,"Arnold", "",123468);
		System.out.println(bol);
		System.out.println("Herencia factura - Cliente ");
		Factura fact = new Factura(7898746,"Juridica",789456123,0,"", " SAC ",123468);
		System.out.println(fact);
		
		System.out.println("**************************************************");
		
		//Cajero - max
		Cajero c = new Cajero(123456789, "Piero", "Canazas", 987654321 );		
		System.out.println("El codigo del cajero es:"+ c.getCodCajero());
		System.out.println("El Nombre del vendedor es:"+ c.getNombreDirector());
		System.out.println("El Apellido del vendedor es:"+ c.getApellidoDirector());
		System.out.println("El codifo del vendedor es:"+ c.getCodEncargado());
		System.out.println(c.toString());
		
		
		System.out.println("**************************************************");
		//producto - Cajero - max
		System.out.println("Agrecacion en clase tipo producto");
		
		Producto prod1 = new Producto("Angel", 10001, 10.5);
		Producto prod2 = new Producto("Shampoo", 10002,0.80);
		Producto prod3 = new Producto("Chicha", 10003,3.8);
		
		//agregacion - imprimimos los productos agregados
		System.out.println("\n aplicando agregacion para imprimir");
		TipoProducto cat = new TipoProducto("cereales");
		cat.agregarProducto(prod1);		
		TipoProducto cat2 = new TipoProducto("Productos de limpieza");
		cat2.agregarProducto(prod2);
		TipoProducto cat3 = new TipoProducto("Refrescos");
		cat3.agregarProducto(prod3);
		
		//Muestra el producto en consola
		cat.mostrarProducto();
		cat2.mostrarProducto();
		cat3.mostrarProducto();
		
		
		System.out.println("**************************************************");
		
		//Compra-  - max
		Compra co = new Compra(10001,2015427863, "Alicorp", 987654321 );		
		System.out.println("El codigo de compra es:"+ co.getCodCompra());
		System.out.println("El RUC es:"+ co.getRuc());
		System.out.println("El proveedor es:"+ co.getProveedor());
		System.out.println("El codigo del supervisor es:"+ co.getCodSupervisor());
		System.out.println(co.toString());

		System.out.println("**************************************************");
		
		//transacion - max
		Transaccion tran = new Transaccion(1111, 10001, 2468);		
		System.out.println("El Codigo Transaccion es:"+ tran.getCodTransaccion());
		System.out.println("Codigo de compra es:"+ tran.getCodCompra());
		System.out.println("Codigo de evnta es:"+ tran.getCodVenta());
		System.out.println(tran.toString());
		
		System.out.println("**************************************************");

		//Venta -max
		Venta ven = new Venta(2468, 5, 155.5, 25.5);		
		System.out.println("El Codigo Venta es:"+ ven.getCodVenta());
		System.out.println("La cantidad de producto:"+ ven.getCantidadProducto());
		System.out.println("El monto a pagar es:"+ ven.getMontoPagar());
		System.out.println("El descuento es:"+ ven.getDescuento());
		System.out.println(ven.toString());
		
		System.out.println("**************************************************");

		//Jefe.Venta - -max
		Vendedor jv = new Vendedor(987654321, " Piero "," Canazas ",123456789);		
		System.out.println("El codigo del area es:"+ jv.getCodVendedor());
		System.out.println("El nombre de gerente de venta es:"+ jv.getNombreVendedor());
		System.out.println("El apellido de gerente de ventas es:"+ jv.getApellidoVendedor());
		System.out.println("El codigo area es:"+ jv.getCodArea());
		System.out.println(jv.toString());
		

		
		
	}

	
}
