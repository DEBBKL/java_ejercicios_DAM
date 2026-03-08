package ejercicio2;
/*Sobrecargar el método sumar() para aceptar:
2 enteros
3 enteros
2 decimales
*/
public class Calculadora {
	public double sumar(double num1, double num2) {
		return num1 + num2;			
	}
	public int sumar(int num1, int num2) {
		return num1+num2;
	}
	public int sumar(int num1, int num2, int num3) {
		return num1+num2+num3;
	}	
}



