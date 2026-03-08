package claseString;

import java.util.Scanner;

/*Convierte un número entero introducido por el 
 * usuario en cadena y muestra su longitud usando 
 * String.valueOf().
*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un nº entero: ");
		int num = sc.nextInt();
		sc.close();
		
		String cadena = String.valueOf(num);
		System.out.println("Nº introducido: "+num);
		System.out.println("Nº a String: "+cadena.toString());
		System.out.println("Longitud: " + cadena.length() + " caracteres.");
	}	
}
