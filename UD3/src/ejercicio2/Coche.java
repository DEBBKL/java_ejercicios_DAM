package ejercicio2;

public class Coche {
String marca;
String modelo;
int velocidad;

	public void acelerar(int incremento) {
		System.out.println("Velocidad actual: "+velocidad);
		velocidad+=incremento;
		System.out.println("Velocidad después del incremento: " + (velocidad - incremento));
	}
	public void frenar(int decremento) {
		System.out.println("Velocidad actual: "+velocidad);
		velocidad-=decremento;
		System.out.println("Velocidad después de frenar: " + velocidad);
	}
	public void mostrarInformacion() {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(velocidad);
	}
}
