package ejercicio4;
/*Crea una clase Calculadora.
Implementa los siguientes métodos estáticos:
sumar(int a, int b)
restar(int a, int b)
multiplicar(int a, int b)
dividir(int a, int b)

Prueba los métodos desde main sin crear objetos.*/

public class Calculadora {
	private int a;
	private int b;
	
	public Calculadora() {
		
	}
	
	public static void sumar(int a, int b) {
		System.out.println("Suma: " + (a + b));
	}
	
	public static void restar(int a, int b) {
		System.out.println("Resta: " + (a - b));
	}
	
	public static void multiplicar(int a, int b) {
		System.out.println("Multiplicación: " + (a * b));
	}
	
	public static void division(int a, int b) {
		System.out.println("División: " + (a / b));
	}
}
