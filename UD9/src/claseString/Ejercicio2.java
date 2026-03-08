package claseString;
/* Invertir cadena
Invertir una cadena sin usar StringBuilder.reverse().*/
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cadena a invertir: ");
		String palabra = sc.nextLine();
		String palabraInvertida = "";
		
		for(int i=palabra.length()-1;i>=0;i--) {
			palabraInvertida += palabra.charAt(i);
		}
		System.out.println(palabraInvertida);
		sc.close();
	}
}
