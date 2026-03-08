package Ejemplo2;

	import java.util.Scanner;

	/*
	Definir una clase CuentaBancaria con:
	titular
	saldo
	metodo ingresar()
	metodo retirar()

	 */
	public class Main {
	    public static void main(String[] args) {
	        CuentaBancaria cuentaGabriel = new CuentaBancaria();
	        Scanner sc=new Scanner(System.in);

	        cuentaGabriel.titular="Gabriel Fernandez Moreno";
	        cuentaGabriel.saldo=5000;

	        System.out.println("¿Desea ingresar o retirar dinero de la cuenta? (1) - Retirar | (0) Ingresar");
	        int opcion=sc.nextInt();

	        if(opcion==0){
	            System.out.println(cuentaGabriel.saldo);
	            System.out.println("Dinero a Ingresar");
	            cuentaGabriel.ingresar(sc.nextDouble());
	        } else if (opcion == 1) {
	            System.out.println(cuentaGabriel.saldo);
	            System.out.println("Dinero a Retirar");
	            cuentaGabriel.retirar(sc.nextDouble());
	        } else {
	            System.out.println("OPCIÓN ERRONEA");
	        }
	    }
	}
