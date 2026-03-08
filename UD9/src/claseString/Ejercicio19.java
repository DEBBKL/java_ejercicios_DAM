package claseString;
/*Separar por múltiples delimitadores
Tokenizar una cadena con delimitadores como , ; :.*/
import java.util.StringTokenizer;
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Juan, con 17 años: es adolescente; casi adulto.";
		StringTokenizer st = new StringTokenizer(texto,",;:.");
		
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}	
	}
}
