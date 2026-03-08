package ejercicio9;
/*Crear una clase Circulo con atributo radio 
 * y método calcularArea() usando Math.PI.*/
public class Circulo {
	double radio;
	
	public double calcularArea() {
		return Math.PI * (radio + radio) ;
	}
	public void mostrarInformacion() {
		System.out.println("El area del circulo con radio " + radio + " es igual a " + calcularArea());
	}
}
