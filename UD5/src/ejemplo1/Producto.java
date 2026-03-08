package ejemplo1;
/*Crear clase Producto con:
nombre
precio
constructor
metodo aplicarDescuento()
equals() basado en nombre // no se ha dado
*/

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void aplicarDescuento(double descuento) {
		this.precio = this.precio - (this.precio * descuento / 100);
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: " + precio);
	}
}
