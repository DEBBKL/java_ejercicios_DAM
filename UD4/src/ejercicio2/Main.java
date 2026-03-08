package ejercicio2;
/*/*Crear clase Calculadora con métodos 
 * sumar, restar, multiplicar, dividir.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		System.out.println("Suma de dos decimales: "
		+calc.sumar(7.50, 2.76));
		System.out.println("Suma de dos enteros: "
		+calc.sumar(2, 4));
		System.out.println("Suma de tres enteros: "
		+calc.sumar(8, 1, 2));
	}
}
