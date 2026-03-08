package ejercicio6;
/* Crear una clase Producto con atributos nombre y precio, y 
 * método aplicarDescuento(double porcentaje).*/
public class Producto {
	String nombre;
	double precio;
	
	public void aplicarDescuento(double porcentaje) {
		precio = precio-(precio*porcentaje)/100;
		System.out.println("Precio con descuento: " + precio + " €");
		}
}
