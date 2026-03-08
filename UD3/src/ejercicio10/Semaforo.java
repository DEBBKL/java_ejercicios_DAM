package ejercicio10;
/* Crear una clase Semaforo con:
Atributo color (rojo, amarillo, verde)

Método cambiarColor() que cambie en orden:
rojo → verde
verde → amarillo
amarillo → rojo
Método puedePasar() que devuelva true solo si está en verde

En el main:
Simular 6 cambios de color mostrando el estado cada vez.
Mostrar si los coches pueden pasar.
*/
public class Semaforo {
	String color = "rojo";
	
	public void cambiarColor() {
		if(color.equals("rojo")) {
			color="verde";
		}else if(color.equals("verde")){
			color = "amarillo";
		}else {
			color="rojo";
		}
	}
	public boolean puedePasar() {
		return color.equals("verde");
	}
	
	public void mostrarEstado() {
		System.out.println("Color actual: "+color);
	}
}
