package ejercicio3;
/*Crear clase Triangulo con atributos base, altura y métodos 
 * calcularArea() y calcularPerimetro().*/
public class Triangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base=base;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;	
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
	public double calcularArea() {
		return (base * altura)/2;
	}
	
	public double calcularPerimetro(double a, double b, double c) {
		return a + b + c;
		 
	}
}
