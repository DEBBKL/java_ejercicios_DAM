package ejercicio7;
/*Crear una clase Contador con un atributo privado valor y 
 * otro atributo limite.
Implementa los siguientes métodos:
incrementar() → aumenta el contador en 1, pero no puede superar el límite.
decrementar() → reduce el contador en 1, pero no puede bajar de 0.
reiniciar() → pone el contador a 0.
mostrarValor() → devuelve el valor actual del contador.*/
public class Contador {
	private int valor;
	private int limite;
	
	public void setLimite(int limite) {
		this.limite=limite;
	}
	
	public int getLimite() {
		return limite;
	}
	
	public void incrementar() {
		if(valor>=limite) {
			System.out.println("No puede superar el límite");
		}else {
			valor++;
		}
	}
	public void decrementar() {
		if(valor<=0) {
			System.out.println("El valor no puede bajar de 0");
		}else {
			valor--;
		}
	}
	public void reiniciar() {
		valor=0;
	}
	
	public void mostrarValor() {
		System.out.println("Valor: " + valor);
	}
}
