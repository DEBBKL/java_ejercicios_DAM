package ejercicio2;



/*Crear una clase Coche con atributos marca, modelo, velocidad. 
 * Añadir métodos acelerar(int incremento) y frenar(int decremento).*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche();
		coche1.marca="Ford Mustang";
		coche1.modelo="GT500 69'";
		coche1.velocidad=100;
		coche1.acelerar(50);
		coche1.frenar(20);
		coche1.mostrarInformacion();
		
		System.out.println("Velocidad inicial: "+ coche1.velocidad);
		
		
		
	}
}
