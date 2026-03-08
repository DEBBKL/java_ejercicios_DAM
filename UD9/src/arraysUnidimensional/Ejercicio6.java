package arraysUnidimensional;
/*Encontrar el mayor y el menor de un array usando for-each.*/

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		int mayor = numeros[0];
		int menor = numeros[0];
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]< menor) {
				menor=numeros[i];
			}
			if (numeros[i]>mayor) {
				mayor = numeros[i];
			}
		}
		
		/*for(int numero:numeros) {
			if(numero>mayor) {
				mayor=numero;
			}
			if(numero<menor) {
				menor=numero;
			}
		}*/
		
		System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
	}
}
