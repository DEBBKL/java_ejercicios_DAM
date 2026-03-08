package ejemplo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un objeto Circulo
				Circulo c1 = new Circulo(5);
				
				// Usar el método de instancia
				double area1 = c1.calcularArea();
				System.out.println("Área del círculo con radio 5: " + area1);
				
				// Usar el método static
				double area2 = Circulo.calcularArea(10);
				System.out.println("Área del círculo con radio 10: " + area2);
	}

}
