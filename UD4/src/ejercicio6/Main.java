package ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banco banco = new Banco();
		
		banco.setSaldo(1000);
		System.out.println("Saldo actual: " + banco.getSaldo());
		
		banco.crearCuenta("Cuenta1");
		banco.crearCuenta("Cuenta2");
		banco.crearCuenta("Cuenta3");
		banco.crearCuenta("Cuenta4");
		banco.crearCuenta("Cuenta5");
		
		banco.crearCuenta("Cuenta6");	
		
		banco.borrarCuenta("Cuenta3");
		
		banco.crearCuenta("Cuenta6");
	}
}
