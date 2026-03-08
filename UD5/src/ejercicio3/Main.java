package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// Crear usuarios
				Usuario u1 = new Usuario("Ana", 25);
				Usuario u2 = new Usuario("Luis", 30);
				Usuario u3 = new Usuario("María", 22);
				
				// Mostrar información de los usuarios
				System.out.println("Usuario 1: " + u1.getNombre() + ", Edad: " + u1.getEdad());
				System.out.println("Usuario 2: " + u2.getNombre() + ", Edad: " + u2.getEdad());
				System.out.println("Usuario 3: " + u3.getNombre() + ", Edad: " + u3.getEdad());
				
				System.out.println();
				
				// Mostrar total de usuarios creados
				Usuario.mostrarTotalUsuarios();
			}
		}