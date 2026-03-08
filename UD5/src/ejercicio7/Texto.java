package ejercicio7;
/*Contador de palabras
Crea una clase Texto.
Constructor que reciba un String.
Método contarPalabras() que devuelva 
el número de palabras del texto.
Usa split().*/

public class Texto {
	private String texto;
	
	public Texto(String texto) {
		this.texto=texto;
	}
	
	public int contarPalabras() {
		if(texto==null || texto.isEmpty()) {
			return 0;
		}
		String[] palabras = texto.split(" ");
		return palabras.length;
	}
}
