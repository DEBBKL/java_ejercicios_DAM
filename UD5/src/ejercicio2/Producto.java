package ejercicio2;
/*Sobrecargar constructores en clase Producto.*/

public class Producto {
	private String nombre;
	private int stock;
	private double precio;
	
	public Producto(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	public Producto() {
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Stock: " + stock);
		System.out.println("Precio: " + precio + "€");
	}
}
