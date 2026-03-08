package Ejercicios;
import java.util.Scanner;
public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Precio base alquiler: ");
		double baseAlquiler = sc.nextDouble();
		System.out.println("Gasto mensual agua: ");
		double gastoAgua = sc.nextDouble();
		System.out.println("Gasto mensual luz: ");
		double gastoLuz = sc.nextDouble();
		System.out.println("Gasto mensual internet: ");
		double gastoInternet = sc.nextDouble();
		sc.close();
		
		double ivaAlquiler = 0.10;
		double importeIvaAlquiler = baseAlquiler*ivaAlquiler;
		double alquilerIva = importeIvaAlquiler + baseAlquiler;
		double gastoTotal = alquilerIva + gastoInternet+ gastoLuz + gastoAgua;
		
		System.out.println("Importe del IVA del alquiler: "+importeIvaAlquiler);
		System.out.println("Importe del alquiler con IVA: "+alquilerIva);
		System.out.println("Gasto total mensual: "+gastoTotal);
		
	}

}
