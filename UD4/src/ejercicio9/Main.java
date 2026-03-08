package ejercicio9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo coche1 = new Vehiculo();
		
		coche1.setMarca("Opel");
		coche1.getMarca();
		
		coche1.setModelo("Corsa");
		coche1.getModelo();
		
		coche1.setVelocidad(100);
		coche1.getVelocidad();
		
		coche1.acelerar(20);
		coche1.getVelocidad();
		coche1.frenar(10);
		coche1.getVelocidad();
		
		coche1.mostrarDatos();
	}

}
