package arraysMultidimensionales;
/*Crear una matriz 3x3 y mostrarla (usar for tradicional y for-each).*/

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] matriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int i,j;
		//mostrar con for tradicional
		System.out.println("Matriz con for tradicional");
		
		for( i = 0; i<matriz.length;i++) {               //filas
			for(j = 0; j<matriz[i].length;j++) { //columnas
				System.out.print(matriz[i][j]+" ");
				}
				System.out.println(); //salto de línea x fila
				
				/*Mostrar con for-each
				 * 
        			System.out.println("Matriz con for-each");

			        for(int[] fila : matriz) {
			            for(int numero : fila) {
			                System.out.print(numero + " ");
			            }
			            System.out.println();
			            */
		}
	}
}


