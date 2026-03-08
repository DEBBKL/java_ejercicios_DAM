package arraysUnidimensional;
import java.util.Scanner;
/*Buscar un número
Solicitar un número al usuario y verificar si existe en el array (usar for-each).*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = {1,2,3,4,5,6,7,8};
		boolean existe = false;

			 System.out.println("Inserta un número que pueda estar en el array: ");
			 int num = sc.nextInt();
			 
			 for(int i =0; i<numeros.length;i++) {
				 if (num==numeros[i]) {
					existe=true;
					break;
				 }	
			 }
			 if(existe) {
				System.out.println("El nº introducido SI está en el array");
			 }else {
				 System.out.println("El nº introducido NO está en el array"); 
			 } 
			 sc.close();		 
		 }				 	
	}

