package ejercicio13;
/*Clase Parking con:
Atributos:
capacidadMaxima
cochesDentro
Método entrarCoche()
Si está lleno → mostrar mensaje
Método salirCoche()
Si no hay coches → error
Método plazasLibres()
En el main:
Simular entradas y salidas
Probar los casos límite
*/
public class Parking {
	int capacidadMaxima;
	int cochesDentro;
	
	public void entrarCoche() {
		if (cochesDentro == capacidadMaxima) {
			System.out.println("Capacidad máxima alcanzada");
		}else {
			cochesDentro++;
			System.out.println("Ahora hay " + cochesDentro + " coches");
		}
	}
	public void salirCoche() {
		if(cochesDentro<=0) {
			System.out.println("No hay ningún coche para salir");
		}else {
			cochesDentro--;
		}
	}
	public int plazasLibres() {
		return capacidadMaxima - cochesDentro;
	}
}

