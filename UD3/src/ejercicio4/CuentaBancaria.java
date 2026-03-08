package ejercicio4;
/*Crear una clase CuentaBancaria con atributos titular y saldo, 
 * y métodos ingresar(double) y retirar(double).*/
public class CuentaBancaria {
	String titular;
	double saldo;
	
	public void ingresar(double incrementar) {
		if(incrementar>0) {
		System.out.println("Saldo actual: "+saldo);
		saldo+=incrementar;
		System.out.println("Saldo actualizado a: "+saldo);
		}else {
			System.out.println("Operación inválida.");
		}
	}
	public void retirar(double decrementar) {
		if(saldo>0) {
		System.out.println("Saldo actual: "+saldo);
		saldo-=decrementar;
		System.out.println("Saldo actualizado a: "+saldo);
		}else {
			System.out.println("Operación inválida.");
		}
	}
	public void mostrarInformacion() {
		System.out.println("Titular: "+titular);
		System.out.println("Saldo: "+saldo);
	}
}
