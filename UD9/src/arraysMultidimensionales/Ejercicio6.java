package arraysMultidimensionales;
/*(Mismas filas que columnas)
*/

public class Ejercicio6 {

	public static void main(String[] args) {
		int[][] matriz= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{6,6,6}
		};
		int columnas = matriz[0].length;
		int filas = matriz.length;
		
		if(filas==columnas) {
			System.out.println("Tienen el mismo nº de filas que de columnas");
		}else {
			System.out.println("NO tienen el mismo nº de filas que de columnas");
		}
	}
}
