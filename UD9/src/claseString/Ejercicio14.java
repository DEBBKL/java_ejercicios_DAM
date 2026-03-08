package claseString;
/*STRINGBUFFER
 * Construcción dinámica
Construir una frase concatenando palabras usando append().*/
public class Ejercicio14 {

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
	}

}
