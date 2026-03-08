package claseString;
/*Pide al usuario una palabra y verifica 
 * si comienza con pre usando startsWith().*/

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = sc.next();
		boolean valido = false;
		
		if(palabra.startsWith("pre")) {
			valido=true;
		}
		
		while(!valido) {
			System.out.println("La palabra no empieza por pre. Inténtelo de nuevo.");
			palabra = sc.next();
			
			if(palabra.startsWith("pre")) {
			valido=true;	
			}
		}
		System.out.println("La palabra " + palabra +  " empieza por pre");
		sc.close();
	}
}
