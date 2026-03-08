package Ejercicios;
import java.util.Scanner;
public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Declara el importe base: ");
		double importeBase = sc.nextDouble();
		sc.close();
		
		double recargo = importeBase* (importeBase * 0.05);
		double impuesto = importeBase - (importeBase* 0.21);
		double importeFinal = recargo + impuesto + importeBase;
		
		System.out.println("Importe final: "+importeFinal);
		System.out.println("Importe base: "+importeBase);
		System.out.println("Importe con recarga: "+recargo);
	}

}
