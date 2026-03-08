package ejercicio14;
/*Clase Temporizador con:
Atributo tiempo (segundos)
Método iniciar()
Hace una cuenta atrás hasta 0
Muestra cada segundo
Método reiniciar(int nuevoTiempo)*/

public class Temporizador {
int segundos;

	public void iniciar() {

		for (int i = segundos; i >=0; i--) {
			System.out.println(i);
		}
	}
	public void reiniciar(int nuevoTiempo) {
		this.segundos = nuevoTiempo;
	}
}

