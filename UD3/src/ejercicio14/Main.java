package ejercicio14;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temporizador temporizador = new Temporizador();
		temporizador.segundos = 30;
		temporizador.iniciar();
		System.out.println(" ");
		temporizador.reiniciar(20);
		temporizador.iniciar();
		
	}
}
