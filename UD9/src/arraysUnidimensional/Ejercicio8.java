package arraysUnidimensional;
/*Contar cuántas veces aparece un número específico dentro del array.
*/
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros= {1,2,3,4,2,2,5,7,8,2};
		System.out.println("Introduce un nº del 1 al 10");
		int num = sc.nextInt();
		int contador = 0;
		
		for(int i=0;i<numeros.length;i++) {
			
			if(numeros[i]==num) {
			contador++;
			}
		}
		System.out.println("El nº "+ num +" aparece "+ contador + " veces");
		sc.close();
	}
}
