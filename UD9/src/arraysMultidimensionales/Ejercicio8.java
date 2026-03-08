package arraysMultidimensionales;
/*Diagonal principal y secundaria
Mostrar ambas diagonales y calcular su suma.
Ejemplo de diagonal principal y secundaria:
1 2 3
4 5 6
7 8 9

Diagonal principal: 1,5 y 9. 	Diagonal secundaria : 3,5 y 7*/

public class Ejercicio8 {

	public static void main(String[] args) {
		int[][] matriz= {
						{1,2,3},
						{4,5,6},
						{7,8,9}
		};
		
		int sumaPrincipal = 0;
		int sumaSecundaria = 0;
		int n = matriz.length;
		
		System.out.println("Diagonal Principal: ");
		for(int i = 0; i<n;i++) {
			System.out.println(matriz[i][i]+ " ");
			sumaPrincipal += matriz[i][i];
		}
		System.out.println("Suma diagonal principal: " + sumaPrincipal);
		System.out.println("Diagonal secundaria: ");
		for(int i = 0; i<n;i++) {
			System.out.println(matriz[i][n -1 -i] + " ");
			sumaSecundaria += matriz[i][n -1 -i];
		}
		System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
	}
}

