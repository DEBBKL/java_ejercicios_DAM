package Ejercicio8;
/* Crear una clase Rectangulo 
 * con atributos base y altura, y método calcularArea().*/
public class Rectangulo {
	double base;
	double altura;
	
	public double calcularArea() {
		return base*altura;
	}
	
	public void mostrarInformacion() {
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Area: " + calcularArea());
	}
}
