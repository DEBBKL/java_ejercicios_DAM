package claseString;

import java.util.Scanner;

/*Pide al usuario un texto y dos números inicio y fin, 
 * y muestra el subtexto entre esos índices usando substring()*/
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		System.out.println("Ahora introduce dos números\nPrimer nº: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo nº: ");
		int num2 = sc.nextInt();
		
		if (num1 < 0 || num2 < 0) {
			System.out.println("Los índices no pueden ser negativos.");

		} else if (num2 <= num1) {                          
			System.out.println("El segundo número debe ser MAYOR que el primero.");

		} else if (num1 >= texto.length() || num2 > texto.length()) {
			System.out.println("Los índices están fuera del rango del texto (longitud: " + texto.length() + ").");

		}else {
		String resultado = texto.substring(num1,num2);
		System.out.println(resultado);
		}
		sc.close();
	}
}
