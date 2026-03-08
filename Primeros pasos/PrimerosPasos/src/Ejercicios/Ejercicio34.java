package Ejercicios;
import java.util.Scanner;
public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Salario bruto mensual: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("IRPF: "+ "%");
		double irpf = sc.nextDouble();
		System.out.println("Seguridad social: "+ "%");
		double ss= sc.nextDouble();
		sc.close();
		
		double importeIrpf = salarioBruto * irpf/100;
		double importeSs = ss * ss /100;
		double totalRetenciones = importeIrpf + importeSs;
		double salarioNeto = salarioBruto + totalRetenciones;
		
		System.out.println("Importe IRPF: "+importeIrpf);
		System.out.println("Importe Seguridad Social: "+importeSs);
		System.out.println("Total retenciones: "+totalRetenciones);
		System.out.println("Salario neto mensual: "+salarioNeto);
	}

}
