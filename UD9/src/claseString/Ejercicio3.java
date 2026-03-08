package claseString;
/*Verificar si una palabra es palíndroma.*/

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra para ver si es palíndroma: ");
		String palabra = sc.next();
		String palindromo = "";
		boolean esPalindromo = false;
		
		for(int i=palabra.length()-1;i>=0;i--) {
			palindromo += palabra.charAt(i);
			if(palindromo.equals(palindromo)) {
			esPalindromo=true;
			}
		}
		if(esPalindromo) {
		System.out.println("Es palindromo.");
		}else {
			System.out.println("No es palindromo.");
		}
		sc.close();
		}
	}
