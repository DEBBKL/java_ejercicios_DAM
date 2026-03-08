package ejercicio13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parking p1 = new Parking();
		
		p1.capacidadMaxima=100;
		p1.cochesDentro=0;
		
		p1.plazasLibres();
		
		for(int i = 0; i < p1.capacidadMaxima +  1; i++) {
			p1.entrarCoche();
		}
		for (int i = p1.capacidadMaxima; i >-1; i--) {
			p1.salirCoche();
		}
	}
}
