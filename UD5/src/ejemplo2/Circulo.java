package ejemplo2;
/*Crear clase Circulo con:
radio
constructor sobrecargado
metodo calcularArea()
metodo static calcularArea(double radio)
*/

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		//return Math.PI * Math.pow(radio,2);
		return Math.PI * (radio * radio);
	}
	
	public static double calcularArea(double radio) {
		return Math.PI * (radio * radio);
	}
}
