package arraysMultidimensionales;

/*Generar la matriz transpuesta.
La matriz transpuesta es una nueva matriz que 
se obtiene intercambiando filas por columnas.*/

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [][] matriz = {
	                {1, 2, 3},
	                {4, 5, 6},
	        };

	        int filas = matriz.length;
	        int columnas = matriz[0].length;

	        int [][] matrizTranspuesta = new int [columnas][filas];

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                matrizTranspuesta[j][i] = matriz[i][j];
	            }
	            System.out.println();
	        }

	        System.out.println("Matriz Original:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }

	        System.out.println("Matriz Transpuesta:");
	        for (int i = 0; i < columnas; i++) {
	            for (int j = 0; j < filas; j++) {
	                System.out.print(matrizTranspuesta[i][j] + " ");
	            }
	            System.out.println();
	    } 
	}
}