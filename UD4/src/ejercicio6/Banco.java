package ejercicio6;
/*Crear clase Banco con atributo privado saldo y 
 * métodos públicos para modificarlo. 
 * Además añade los métodos 
 * crearCuenta(String nombreCuenta) y borrarCuenta (String nombreCuenta). 
 * Puede haber un máximo de 5 cuentas (Array (String))*/

public class Banco {
	private double saldo;
	String[] cuentas = new String[5];
	int numCuentas = 0;
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void crearCuenta(String nombreCuenta) {
	
		if(numCuentas>5) {
			System.out.println("Se ha alcanzado el máximo número de cuentas");
		}else {
			numCuentas++;
			System.out.println("Su cuenta " + nombreCuenta +" se ha registrado correctamente");
			System.out.println("Cuentas disponibles: " + (5-numCuentas));
		}
	}
	public void borrarCuenta(String nombreCuenta) {
		
		boolean cuentaCorrecta = false;
		
		for (int i = 0; i < numCuentas; i++) {
			if(cuentas[i].equals(nombreCuenta)) {
				for(int j = i;j<numCuentas -1;j++) {
				cuentas[j] = cuentas[j+1];
				}
				cuentas[numCuentas - 1] = null;
				numCuentas--;
				
				cuentaCorrecta=true;
				System.out.println("Cuenta eliminada " + nombreCuenta);
				break;
			}
		}
		if(!cuentaCorrecta) {
			System.out.println("La cuenta no existe");
		}
	}
}
