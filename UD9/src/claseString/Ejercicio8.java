package claseString;
/*
Pide al usuario un correo electrónico y verifica 
si termina con @gmail.com usando endsWith().
*/
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu correo electrónico: ");
		String correo = sc.next();
		boolean valido = false;
		
		if(correo.endsWith("@gmail.com")) {
			valido=true;
		}
		
		while(!valido) {
			System.out.println("Debe usar un correo de gmail. Inténtelo de nuevo.");
			correo = sc.next();
			
			if(correo.endsWith("@gmail.com")) {
			valido=true;	
			}
		}
		System.out.println("Correo validado");
		sc.close();
	}
}
