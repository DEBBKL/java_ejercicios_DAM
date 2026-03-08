package arraysUnidimensional;
/*Promedio de valores
Calcular el promedio de un array de tipo double.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		double[] numeros = {1,2,3,4,5,6,7,8};
		double sumaFor=0;
		double promedio = 0;
		//int sumaForEach=0;
					
				//suma for clásico
				
				for (int i = 0; i < numeros.length;i++){
					sumaFor += numeros[i];
					
				}
				promedio = sumaFor/numeros.length;
				System.out.println("Promedio con for clásico: " + promedio);
					
					/*suma con for-each
					 * 
					 * for (double numero : numeros {
					 * sumaForEach += numero;
					 * 
					 * }
					 * promedio = sumaForEach/numeros;
					 * System.out.println("Promedio con for-each: " + promedio;
					 */				
			}
		}