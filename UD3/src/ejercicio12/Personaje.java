package ejercicio12;
/*Clase Personaje con:
Atributos: nombre, vida (empieza en 100)
Método recibirDanio(int cantidad)
No puede bajar de 0
Método curar(int cantidad)
No puede superar 100
Método estaVivo() que devuelva boolean
En el main:
Simular varios ataques y curaciones
Mostrar la vida después de cada acción
Mostrar mensaje cuando muera
*/
public class Personaje {
	String nombre;
	double vida = 100;
	
	public void recibirDanio(int cantidad) {
		if(cantidad<0) {
			System.out.println("El daño es insuficiente");
		}else {
			vida = vida - cantidad;
			System.out.println("Vida restante: " + vida);
			}
		}
		
		public void curar(int cantidad) {
			if(cantidad>100) {
				System.out.println("La cantidad de curación excede la cantidad de vida");
			}else {
				vida = vida + cantidad;
				System.out.println("Vida restante: " + vida);
			}
		}
			
			public boolean estaVivo() {
				if(vida<=0) {
					return false;
				}else {
					return true;
				}
	}
}
