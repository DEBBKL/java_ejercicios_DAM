package ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.titular = "Alfonso Ruperez";
		cuenta1.saldo = 1000;
		cuenta1.ingresar(500);
		cuenta1.retirar(100);
		cuenta1.mostrarInformacion();
	}

}
