package ejercicio6;

import java.util.Random;

/*Crea una clase PasswordGenerator.
Método estático generarPassword(int longitud).
Debe generar una contraseña aleatoria usando letras y números.
Utiliza la clase Random.
Pista:
String caracteres = 
"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
random.nextInt(caracteres.length());
*/
public class PasswordGenerator {
	
	
	public PasswordGenerator() {
		
	}
	
	public static String generarPassword(int longitud) {
		Random rand = new Random();
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		StringBuilder password = new StringBuilder();
		
		for(int i = 0; i<longitud;i++) {
			int indice = rand.nextInt(caracteres.length());
			password.append(caracteres.charAt(indice));
		}
		
		return password.toString();
	}
	
}
