package claseString;
/*Convierte un booleano en cadena y muestra un mensaje como:
 "El valor booleano en texto es: true" usando String.valueOf().*/
public class Ejercicio13 {

	public static void main(String[] args) {
		boolean bandera = true;
		String banderaString = String.valueOf(bandera);
		
		System.out.println("El valor booleano en texto es: " + banderaString);

	}

}
