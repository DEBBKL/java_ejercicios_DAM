package Ejercicios;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la velocidad inicial: ");
		double velocidad = sc.nextDouble();
		System.out.println("Introduzca la aceleración: ");
		double aceleracion = sc.nextDouble();
		System.out.println("Introduzca el tiempo: ");
		double tiempo = sc.nextDouble();
		sc.close();
		double distancia = velocidad*tiempo+(aceleracion * tiempo *tiempo)/2;
		System.out.println("Distancia: "+distancia);
		
		
	}

}
