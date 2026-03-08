package arraysUnidimensional;
/*Ordenar manualmente (sin usar Arrays.sort)
Implementar ordenamiento burbuja.
 Después mostrar resultado con for-each*/

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] numeros= {33,42,12,23,77,32,1,92};
		
		for(int i=0;i<numeros.length -1;i++) {
			
			for(int j=0;j<numeros.length -1 -i;j++) {
				
				if(numeros[j]>numeros[j + 1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j+1] = aux;	
				}
			}
		}
		System.out.println("Array ordenado: ");
		for (int num:numeros) {
			System.out.print(num + " ");
		}
	}
}
