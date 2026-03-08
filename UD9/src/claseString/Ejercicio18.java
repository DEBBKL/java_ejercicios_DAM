package claseString;
//Contar cuántos tokens hay en una cadena.

import java.util.StringTokenizer;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Caballo,Perro,Gato";
		StringTokenizer st = new StringTokenizer(texto,",");
		
		
			System.out.println(st.countTokens());
		}
	}

