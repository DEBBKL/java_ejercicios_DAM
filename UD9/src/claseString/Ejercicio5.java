package claseString;
/*Dadas dos cadenas, verificar si son 
 * iguales usando compareTo() 
 * y mostrar un mensaje: "Iguales" o "Diferentes".*/

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer nombre: ");
		String nombre1 = sc.nextLine();
		System.out.println("Introduce el segundo nombre: ");
		String nombre2 = sc.nextLine();
		
		int resultado = nombre1.compareTo(nombre2);
		
		if (resultado==0) {
			System.out.println("Iguales");
		}else {
			System.out.println("Diferentes");
		}
		sc.close();
	}
}


