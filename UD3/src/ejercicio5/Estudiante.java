package ejercicio5;
/*Crear una clase Estudiante 
 * con atributos nombre, nota1, nota2,nota3 y 
 * método calcularMedia().*/
public class Estudiante {
	String nombre;
	double nota1, nota2, nota3;
	double media;
	
	public void calcularMedia() {
		media = (nota1+nota2+nota3)/3;
		System.out.println("La nota media entre "+nota1 + ", " + nota2 + " y "+nota3+" es igual a " + media);
	}
}
