package arraysMultidimensionales;
/*Suma total de una matriz
Sumar todos los elementos usando doble for-each*/

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sumaTotal = 0;
		
		for(int[] fila:matriz) {
			for(int numero:fila) {
				sumaTotal+=numero;
			}
		}
		System.out.println("La suma total es: " + sumaTotal);
	}	
}
/*int matriz[][] = {
{5,4,9},
{2,6,8},
{3,7,1}
};
int total = 0;
int i,j;
for (i=0;i<matriz.length;i++) {
for (j=0;j<matriz[i].length;j++) {
total += matriz[i][j];
}
}
System.out.print("Total = " + total + " ");
}
}*/
