package ejercicio13;
/*Invertir texto
Crea una clase TextoUtil.
Método estático invertir(String texto).
Debe devolver el texto invertido.
*/

public class TextoUtil {

	public TextoUtil() {
		
	}
	
	public static String invertir(String texto) {
		String invertido = " ";
		for(int i = texto.length()-1;i>=0;i--) {
			invertido = invertido + texto.charAt(i);
		}
		return invertido;
	}
}

