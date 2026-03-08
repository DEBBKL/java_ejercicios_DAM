package Ejercicio7;
/*Crear una clase Pelicula con:
Atributos: titulo, duracion (en minutos), edadMinima
Método esAptaPara(int edad) que devuelva true o false
Método mostrarInformacion() que muestre todos los datos
En el main, crea una película y pregunta si es apta para una persona de cierta edad.*/

public class Pelicula {
	String titulo;
	int duracion;
	int edadMinima;
	
	
	public boolean esAptaPara(int edad) {
		if(edad>=edadMinima) {
			return true;
		}else{
			return false;
		}
	}
		
		public void mostrarInformacion() {
			System.out.println("Título: "+titulo);
			System.out.println("Edad minima: " + edadMinima);
			System.out.println("Duración: "+duracion);
			
		
		
	}
}
