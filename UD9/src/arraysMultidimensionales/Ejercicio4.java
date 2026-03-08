package arraysMultidimensionales;
/*Suma por columnas
Calcular suma de cada columna.
*/
public class Ejercicio4 {

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
        System.out.println("Filas: " + filas);
        //matriz[0].length devuelve la longitud del primer array ({1,2,3})
        int columnas = matriz[0].length;
        System.out.println("Columnas: " + columnas);

        // Este for recorre las columnas
        for (int i = 0; i < columnas; i++) {
            int sumacolumna = 0;
            //Este for recorre las filas
            for (int j = 0; j < filas; j++) {
                sumacolumna += matriz[j][i];
            }
            System.out.println("Suma de la Columna: " + sumacolumna);
        }

    }
}
