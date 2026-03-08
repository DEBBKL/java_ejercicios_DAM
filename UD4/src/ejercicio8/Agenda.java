package ejercicio8;
/*Crear una clase Agenda con un atributo contactos (array de String) 
 * con capacidad máxima de 10 contactos.
Implementa los métodos:
agregarContacto(String nombre) → añade un contacto si hay espacio 
disponible.
eliminarContacto(String nombre) → elimina el contacto si existe.
mostrarContactos() → muestra todos los contactos almacenados.
buscarContacto(String nombre) → indica si un contacto existe o no 
en la agenda.*/

public class Agenda {
	String[] contactos = new String[10];
	int totalContactos = 0;
	
	public void agregarContacto(String nombre) {
		if(totalContactos < contactos.length) {
			contactos[totalContactos]=nombre;
			totalContactos++;
			System.out.println("Contacto añadido: " + nombre);
		}else {
			System.out.println("Agenda llena");
		}
	}
	
	public void eliminarContacto(String nombre) {
		for(int i = 0; i < totalContactos; i++) {
			if(contactos[i].equals(nombre)) {
				
				for(int j = 0; j<totalContactos -1; j++) {
					contactos[j] = contactos[j+1];
				}
				contactos[totalContactos - 1] = null;
				totalContactos--;
				
				System.out.println("Contacto eliminado: " + nombre);
				return;
			}
		}
		System.out.println("Contacto no encontrado");
	}
	
	public void mostrarContactos() {
		System.out.println("Agenda: ");
		for(int i = 0; i < totalContactos; i++) {
			System.out.println(contactos[i]);
			}
		}
		
	public void buscarContacto(String nombre) {
		for(int i = 0; i < totalContactos; i++) {
			if(contactos[i].equals(nombre)) {
				System.out.println("Contacto encontrado");
				return;
			}
		}	
		System.out.println("Contacto NO encontrado");
	}
}
