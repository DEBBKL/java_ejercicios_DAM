package claseString;
/*
Manipulación de texto con StringBuffer
Cree un StringBuffer con el texto "Java".
Agregue " es divertido" al final.
Inserte " realmente" después de "Java".
Reemplace la palabra "divertido" por "potente".
Elimine la palabra "realmente".
Invierta todo el texto.
Muestre el resultado después de cada operación.
*/

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer texto = new StringBuffer("Java");
		
		texto.insert(4, " es divertido ");
		System.out.println(texto);
		
		texto.insert(5, " realmente ");
		System.out.println(texto);
		
		texto.replace(19, 29, "potente");
		System.out.println(texto);
		
		texto.delete(6,16);
		System.out.println(texto);
		
		texto.reverse();
		System.out.println(texto);
	}
}
