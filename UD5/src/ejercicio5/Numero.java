package ejercicio5;
/*Número mayor y menor
Crea una clase Numero.
Atributos: a y b.
Constructor que reciba ambos números.
Método mayor() que devuelva el mayor usando Math.max().
Método menor() que devuelva el menor usando Math.min().*/

public class Numero {
	private int a;
	private int b;
	
	public Numero(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int mayor() {
		return Math.max(a, b);
	}
	
	public int menor() {
		return Math.min(a, b);
	}
}
