package ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		// Producto usando constructor con parámetros
		Producto p1 = new Producto("Teclado", 15, 29.99);
		
		// Producto usando constructor vacío
		Producto p2 = new Producto();
		p2.setNombre("Ratón");
		p2.setStock(30);
		p2.setPrecio(12.50);
		
		// Mostrar información
		System.out.println("Producto 1:");
		p1.mostrarInfo();
		
		System.out.println();
		
		System.out.println("Producto 2:");
		p2.mostrarInfo();
		
	}
}
