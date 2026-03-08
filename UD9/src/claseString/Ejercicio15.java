package claseString;
/*
 * STRINGBUFFER
 * Usar insert() y delete() para modificar una cadena.
 * 
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer frase = new StringBuffer();
		
		frase.append("No");
		frase.append(" ");
		frase.append("hay");
		frase.append(" ");
		frase.append("pan");
		frase.append(" ");
		frase.append("para");
		frase.append(" ");
		frase.append("tanto");
		frase.append(" ");
		frase.append("chorizo.");
		
		
		System.out.println("Frase completa: " + frase);
		System.out.println("Caracteres: " + frase.length());
		
		frase.insert(7, "buen ");
		System.out.println("Frase completa: " + frase);
		System.out.println("Caracteres: " + frase.length());
		
		frase.delete(0, 3);
		System.out.println("Frase completa: " + frase);
		System.out.println("Caracteres: " + frase.length());
	}
}
