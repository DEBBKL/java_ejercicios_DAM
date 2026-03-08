package Ejercicio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula pelicula1 = new Pelicula();
		pelicula1.titulo ="Lo que el viento se llevó";
		pelicula1.duracion = 160;
		pelicula1.edadMinima=18;
		
		System.out.println("¿Eres apto para ver la película? "+pelicula1.titulo);
		System.out.println(pelicula1.esAptaPara(15));
		
		pelicula1.mostrarInformacion();
	}

}
