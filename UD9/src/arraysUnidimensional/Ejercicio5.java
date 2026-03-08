package arraysUnidimensional;
/*Contar números pares
Contar cuántos números pares hay en un array usando for-each.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1,2,3,4,5,6,7};
		int contador = 0;
		
		for(int numero:numeros) {
			if(numero%2==0) {
				contador++;
			}
		}
			System.out.println("Hay " + contador + " números pares");
		}
	}
