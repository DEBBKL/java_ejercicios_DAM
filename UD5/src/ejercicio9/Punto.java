package ejercicio9;
/*Distancia entre dos puntos
Crea una clase Punto.
Atributos: x y y.
Constructor que inicialice ambos valores.
Método distancia(Punto otro) que calcule la distancia 
entre dos puntos.
Usa Math.sqrt() y Math.pow().
*/
public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public static double distancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p2.getX(), p1.getX()) + Math.pow(p2.getY() - p1.getY(),2));
	}
	
	public static void main(String[] args) {
		Punto p1 = new Punto(1, 2);
		Punto p2 = new Punto(4, 6);
		
		double resultado = distancia(p1, p2);
		System.out.println("Distancia: " + resultado);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
