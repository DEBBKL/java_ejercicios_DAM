package arraysMultidimensionales;
/*Multiplicación de matrices
Multiplicar dos matrices compatibles y crear la 3  a partir del resultado
*/
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int[][] matriz1= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matriz2= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int [][] matriz3 = new int [filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
                System.out.print(matriz3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}