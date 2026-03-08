package Ejercicios;
import java.util.Scanner;
public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Km del viaje: ");
		double km = sc.nextDouble();
		System.out.println("Consumo del Coche: ");
		double consumo = sc.nextDouble();
		System.out.println("Precio del combustible: ");
		double precio = sc.nextDouble();
		System.out.println("Coste de peajes: ");
		double peaje = sc.nextDouble();
		System.out.println("Coste del aparcamiento: ");
		double aparcamiento = sc.nextDouble();
		sc.close();
		
		double combustibleConsumido = (km * consumo)/100;
		double costeCombustible = combustibleConsumido * precio;
		double costeTotal = costeCombustible + peaje + aparcamiento;
		
		System.out.println("Coste total: "+costeTotal);
		System.out.println("Coste combustible: "+costeCombustible);
		System.out.println("Combustible consumido: "+combustibleConsumido);
	}

}
