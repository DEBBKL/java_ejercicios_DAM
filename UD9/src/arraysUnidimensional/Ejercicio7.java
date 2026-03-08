package arraysUnidimensional;

import java.util.Arrays;

/* Invertir un array
Crear un segundo array con los elementos invertidos.
*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= {1,2,3,4,5};
		int[] invertido = new int[numeros.length];
		
		for(int i=0;i<numeros.length;i++) {
			invertido[i] = numeros[numeros.length - 1 - i];
		}
		System.out.println(Arrays.toString(invertido));
	}
}
