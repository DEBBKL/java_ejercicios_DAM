package Ejercicios;
import java.util.Scanner;
public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = sc.toString();
		System.out.println("Edad: ");
		int edad = sc.nextInt();
		System.out.println("Nota de exámenes: ");
		double notaBaseExamenes = sc.nextDouble();
		System.out.println("Nota de prácticas: ");
		double notaBasePracticas = sc.nextDouble();
		System.out.println("Nota de proyectos: ");
		double notaBaseProyectos = sc.nextDouble();
		System.out.println("Días dedicados al estudio: ");
		int dias = sc.nextInt();
		System.out.println("Horas dedicadas al estudio: ");
		int horas = sc.nextInt();
		System.out.println("Segundos dedicados al estudio: ");
		int segundos = sc.nextInt();
		sc.close();
		
		final double pesoExamenes = notaBaseExamenes - (notaBaseExamenes*0.45);
		final double pesoPracticas = notaBasePracticas - (notaBasePracticas*0.35);
		final double pesoProyectos = notaBaseProyectos - (notaBaseProyectos*0.20);
		

		int totalMinutos = ((segundos *60*60)+(horas*60)+((dias*24)/60));
		
		double notaFinal = (pesoExamenes + pesoPracticas + pesoProyectos)/3;
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad + "años.");
		System.out.println("Nota exámenes: "+notaBaseExamenes);
		System.out.println("Nota prácticas: "+notaBasePracticas);
		System.out.println("Nota proyectos: "+notaBaseProyectos);
		System.out.println("Nota Final Redondeada: "+(int)notaFinal);
		System.out.println("Tiempo Total de Estudio: "+totalMinutos + "minutos");
		
	}

}
