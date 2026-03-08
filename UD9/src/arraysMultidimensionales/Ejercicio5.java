package arraysMultidimensionales;
import java.util.Scanner;
/*Buscar un número en matriz
Indicar si un número está presente.
*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {1,1,1}
        };
        // matriz.length lo que devuelve es el número de arrays que contiene la matriz
        int filas = matriz.length;
        
        //matriz[0].length devuelve la longitud del primer array ({1,2,3})
        int columnas = matriz[0].length;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un nº para buscarlo en la matriz");
        int numero = sc.nextInt();
        sc.close();

        // Este for recorre las columnas
        for (int i = 0; i < columnas; i++) {
           
            //Este for recorre las filas
            for (int j = 0; j < filas; j++) {
                if(matriz[j][i] == numero) {
                	encontrado = true;
                	break;
                }
            }
            if(encontrado) {
            	break;
            }
        }
        if(encontrado) {
        	System.out.println("El nº " + numero + " está presente");
        }else {
        	System.out.println("El nº " + numero + " NO está presente");
        }
    }
}
