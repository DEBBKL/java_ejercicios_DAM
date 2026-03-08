package ejercicio3;
/*Contador de objetos
Crea una clase Usuario.
Atributos: nombre, edad.
Crea un constructor para inicializarlos.
Añade un atributo estático totalUsuarios.
Cada vez que se cree un objeto, incrementa ese contador.
Crea un método estático mostrarTotalUsuarios() 
que imprima el total de usuarios creados.*/

public class Usuario {
	private String nombre;
	private int edad;
	private static int totalUsuarios = 0;
	
	public Usuario(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		totalUsuarios++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getTotalUsuarios() {
		return totalUsuarios;
	}

	public static void setTotalUsuarios(int totalUsuarios) {
		Usuario.totalUsuarios = totalUsuarios;
	}

	public static void mostrarTotalUsuarios() {
		System.out.println("Total de usuarios creados: " + totalUsuarios);
	}
}
