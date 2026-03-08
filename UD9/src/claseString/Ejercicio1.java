package claseString;
/*Contar vocales en una cadena usando charAt().
*/
public class Ejercicio1 {

    public static void main(String[] args) {
        String palabra = "Esternocleidomastoideo";
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' ||
                palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u' ||
                palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'I' ||
                palabra.charAt(i) == 'O' || palabra.charAt(i) == 'U')
				contador++;
        }
        System.out.println("La palabra " + palabra + " contiene: " + contador + " vocales");
    }
}