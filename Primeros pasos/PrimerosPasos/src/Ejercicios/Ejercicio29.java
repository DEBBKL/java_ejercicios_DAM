package Ejercicios;
import java.util.Scanner;
public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese aquí su nota de exámenes: ");
		double examenesBase = sc.nextDouble();
		System.out.println("Ingrese aquí su nota de prácticas: ");
		double practicasBase = sc.nextDouble();
		System.out.println("Ingrese aquí su nota de proyectos: ");
		double proyectosBase = sc.nextDouble();
		sc.close();
		
		double pesoExamenes = examenesBase-(examenesBase*0.45);
		double pesoPracticas = practicasBase-(practicasBase*0.35);
		double pesoProyectos = proyectosBase-(proyectosBase*0.25);
		
		double notaFinal=(pesoExamenes+pesoPracticas+pesoProyectos)/2;
		System.out.println("Nota final: "+notaFinal);
	}

}
