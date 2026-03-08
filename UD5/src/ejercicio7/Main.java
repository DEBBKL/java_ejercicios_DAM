package ejercicio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Texto t1 = new Texto("Lorem Ipsum");
		Texto t2 = new Texto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
		
		System.out.println("Texto 1: Nº de palabras = " + t1.contarPalabras());
		System.out.println("Texto 2: Nº de palabras = " + t2.contarPalabras());
	}
}
