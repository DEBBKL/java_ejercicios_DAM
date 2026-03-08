package claseString;
/*Dada una cadena con espacios antes y después, 
 * verifica si al usar trim() la longitud disminuye 
 * y muestra la diferencia de caracteres.
startsWith() y endsWith()
Sirven para verificar si una cadena comienza o termina con un texto específico.
*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "      Man in the middle    ";
		String cadenaTrim = cadena.trim();
		int diferencia = cadena.length() - cadenaTrim.length();
		
		System.out.println("Cadena: " + cadena);
		System.out.println("Cadena con trim:  " + cadenaTrim);
		System.out.println("Longitud de la cadena: " + cadena.length() + " caracteres.");
		System.out.println("Longitud de la cadena con trim: " + cadenaTrim.length() + " caracteres.");
		System.out.println("Diferencia entre ambos: " + diferencia + " caracteres");
		
	}

}
