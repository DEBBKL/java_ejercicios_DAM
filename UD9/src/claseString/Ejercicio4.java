package claseString;
/*Escribe un programa que pida al usuario dos nombres y diga cuál va antes en orden alfabético usando compareTo().*/
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer nombre: ");
		String nombre1 = sc.nextLine();
		System.out.println("Introduce el segundo nombre: ");
		String nombre2 = sc.nextLine();
		
		int resultado = nombre1.compareTo(nombre2);
		
		if (resultado<0) {
			System.out.println(nombre1 + " va primero que " + nombre2);
		}else if(resultado>0){
			System.out.println(nombre2 + " va primero que " + nombre1);
		}else {
			System.out.println(nombre2 + " es igual que " + nombre1);
		}
		sc.close();
	}

}
