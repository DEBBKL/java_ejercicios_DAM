package ejercicio12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje jugador1 = new Personaje();
		jugador1.nombre = "Deborah";
		jugador1.recibirDanio(20);
		
		jugador1.curar(10);
		
		jugador1.recibirDanio(90);
		
		System.out.println("¿Sigues vivo? " + jugador1.estaVivo());
	}
}
