package Ejercicios;
import java.util.Scanner;
public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Precio de compra del producto: ");
		double precioCompra = sc.nextDouble();
		System.out.println("Precio de venta del producto: ");
		double precioVenta = sc.nextDouble();
		System.out.println("Nº Unidades vendidas: ");
		int unidadesVendidas = sc.nextInt();
		sc.close();
		
		double beneficioUnidad =  precioVenta - precioCompra;
		double beneficioTotal = unidadesVendidas * beneficioUnidad;
		
		System.out.println("Beneficio por unidad: "+beneficioUnidad);
		System.out.println("Beneficio total: "+beneficioTotal);
	}

}
