package ejercicio10;
/*Número primo
Crea una clase NumeroPrimo.
Implementa un método estático esPrimo(int n).
Debe devolver true si el número es primo y false en caso contrario.*/

public class NumeroPrimo {
	private int n;
	boolean primo = false;
	
	public NumeroPrimo(int n) {
		this.n=n;
	}
	
	public static boolean esPrimo(int n) {
		if(n<=1) {
			return false;
	}
		for(int i = 2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
