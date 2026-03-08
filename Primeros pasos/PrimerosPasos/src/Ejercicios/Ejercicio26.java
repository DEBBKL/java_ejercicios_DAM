package Ejercicios;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el número de días:");
		int dias = sc.nextInt();
		System.out.println("Ingresa el número de horas:");
		int horas = sc.nextInt();
		System.out.println("Ingresa el número de minutos:");
		int minutos = sc.nextInt();
		System.out.println("Ingresa el número de segundos:");
		int segundos = sc.nextInt();
		sc.close();
		
		int segundosMinutos = minutos * 60;
		int segundosHoras = horas * 60 * 60;
		int segundosDias = dias *60 *60 *24;
		
		System.out.println("Minutos a segundos: "+ segundosMinutos);
		System.out.println("Horas a segundos: "+ segundosHoras);
		System.out.println("Dias a segundos: "+ segundosDias);
		
		int sumaSegundos = (segundosDias + segundosHoras + segundosMinutos + segundos);
		System.out.println("Total de Segundos: "+ sumaSegundos);
		System.out.println("Total de Segundos: "+ segundosDias + segundosHoras + segundosMinutos + segundos);
	}

}
