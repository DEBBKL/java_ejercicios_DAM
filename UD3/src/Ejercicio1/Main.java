package Ejercicio1;
/*Crear una clase Libro con atributos titulo, autor, numeroPaginas y un método mostrarInformacion() que imprima sus datos.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro();
		libro1.titulo = "Lo que el viento se llevó.";
		libro1.autor = "Alguien";
		libro1.numPaginas = 200;
		
		libro1.mostrarInformacion();
	}

}
