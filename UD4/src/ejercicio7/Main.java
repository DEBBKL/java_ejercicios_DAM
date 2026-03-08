package ejercicio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador contador = new Contador();

		contador.setLimite(5);

		contador.incrementar();
		contador.incrementar();
		contador.incrementar();

		contador.mostrarValor();

		contador.decrementar();

		contador.mostrarValor();

		contador.reiniciar();

		contador.mostrarValor();
	}
}
