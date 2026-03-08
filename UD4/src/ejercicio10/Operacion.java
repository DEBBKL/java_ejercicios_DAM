package ejercicio10;
/*Crear una clase Operacion con varios métodos calcular() 
 * utilizando sobrecarga de métodos:
calcular(int a, int b) → devuelve la suma.
calcular(double a, double b) → devuelve la multiplicación.
calcular(int a, int b, int c) → devuelve el promedio de los tres números.
calcular(int a) → devuelve el cuadrado del número.*/

public class Operacion {
	
	public int calcular(int a, int b) {
		return a + b;
	}
	
	public double calcular(double a, double b) {
		return a* b;
	}
	
	public int calcular(int a, int b, int c) {
		return (a+b+c)/3;
	}
	
	public int calcular(int a) {
		return a*a;
	}
}
