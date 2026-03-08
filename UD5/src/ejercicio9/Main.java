package ejercicio9;

public class Main {

	public static void main(String[] args) {
        // Crear los puntos
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);

        // Calcular la distancia
        double resultado = Punto.distancia(p1, p2);

        // Mostrar resultados
        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Distancia: " + resultado);
    }
}	
