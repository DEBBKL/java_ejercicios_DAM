package claseString;

import java.util.StringTokenizer;

/*Separar palabras de una frase usando StringTokenizer.*/
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Caballo,Perro,Gato";
		StringTokenizer st = new StringTokenizer(texto,",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
