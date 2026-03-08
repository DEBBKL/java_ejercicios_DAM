package ejercicio10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo semaforo = new Semaforo();
		
		for ( int i= 0;i<6;i++) {
			semaforo.mostrarEstado();
			System.out.println("¿Puede pasar? " + semaforo.puedePasar());
			semaforo.cambiarColor();
		}
	}
}
