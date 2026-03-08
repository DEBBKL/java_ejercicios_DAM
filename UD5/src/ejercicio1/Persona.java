package ejercicio1;
/*Crear clase Persona con constructor que 
 * inicialice todos los atributos.*/

public class Persona {
	private String nombre;
	private int edad;
	private String sexo;
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public void mostrarInformacion() {
		System.out.println("---------INFO---------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Sexo: " + this.sexo);
	}
}
