package ejercicio1;
/*Crear clase Calculadora con métodos 
 * sumar, restar, multiplicar, dividir.*/

public class Calculadora {
	

	
		public double sumar(double num1, double num2) {
			return num1 + num2;			
		}
		
		public void restar(double num1, double num2) {
			double resta = num1 - num2;
			System.out.println("La resta de " + num1 + " y " + num2 + " da " + resta);
		}
		
		public void multiplicar(double num1, double num2) {
			double multiplicacion = num1 * num2;
			System.out.println("La multiplicacion de " + num1 + " y " + num2 + " da " + multiplicacion);
		}
		
		public void dividir(double num1, double num2) {
			if(num2==0) {
				System.out.println("Error: no se puede dividir entre 0");
			}else {
			
			double division = num1 / num2;
			System.out.println("La division de " + num1 + " y " + num2 + " da " + division);
		}
	}
}

