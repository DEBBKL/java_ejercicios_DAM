package arraysUnidimensional;
//Dado un array de 8 números, calcular la suma total usando for-each y for.

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] numeros = {1,2,3,4,5,6,7,8};
	int sumaFor=0;
	//int sumaForEach=0;
				
			//suma for clásico
			
			for (int i = 0; i < numeros.length;i++){
				sumaFor += numeros[i];
			}
				System.out.println("Suma con for clásico: " + sumaFor);
				
				/*suma con for-each
				 * 
				 * for (int numero : numeros {
				 * sumaForEach += numero;
				 * }
				 * System.out.println("Suma con for-each: " + sumaForEach;
				 */				
		}
	}

