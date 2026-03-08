package arraysMultidimensionales;
/*Suma por filas
Mostrar la suma de cada fila usando for-each
*/

public class Ejercicio3 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int numeroFila = 1;

        for(int[] fila : matriz) {
        	int sumaFila = 0;   // Se reinicia en cada fila

            for(int numero : fila) {
                sumaFila += numero;
            }

            System.out.println("La suma de la fila " + numeroFila + " es: " + sumaFila);
            numeroFila++;
        }
    }
}

