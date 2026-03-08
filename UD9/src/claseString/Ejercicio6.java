package claseString;
/*Pide al usuario que ingrese su nombre con espacios al inicio y final,
 *  y muestra el nombre sin espacios usando trim().*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre completo: ");
		String nombre = sc.nextLine();
		
		nombre = nombre.trim();
		System.out.println("Tu nombre es: " + nombre);
		sc.close();
	}
}
