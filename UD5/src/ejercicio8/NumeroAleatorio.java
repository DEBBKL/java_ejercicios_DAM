package ejercicio8;
import java.util.Random;
/*Número aleatorio en rango
Crea una clase NumeroAleatorio.
Implementa un método estático generar(int min, int max).
Debe devolver un número aleatorio dentro del rango indicado.
Usa Random.*/
public class NumeroAleatorio {
	private int min;
	private int max;

		public NumeroAleatorio(int min, int max) {
			this.min=min;
			this.max=max;
	}

		public static void generar(int min, int max) {
			Random random = new Random();
			int numero = random.ints(min, max).findFirst().getAsInt();
			System.out.println("Nº aleatorio: " + numero);
	}
}

