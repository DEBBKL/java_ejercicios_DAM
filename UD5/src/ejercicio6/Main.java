package ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass1 = PasswordGenerator.generarPassword(8);
		String pass2 = PasswordGenerator.generarPassword(12);
		
		System.out.println("Password 1: " + pass1);
		System.out.println("Password 2: " + pass2);
	}
}

