package Ejercicios;
import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Precio producto 1: ");
		double precio1 = sc.nextDouble();
		System.out.println("Precio producto 2: ");
		double precio2 = sc.nextDouble();
		System.out.println("Precio producto 3: ");
		double precio3 = sc.nextDouble();
		sc.close();
		
		final double descuento = 0.10;
		final double iva = 0.21;
		
		double sumaTotal = precio1+precio2+precio3;
		double importeDescuento = sumaTotal*descuento;
		double importeIva =sumaTotal*iva;
		double precioFinal = sumaTotal - importeIva + importeDescuento;
		
		System.out.println("Suma total de los productos: "+ sumaTotal);
		System.out.println("Importe del descuento: "+importeDescuento);
		System.out.println("Precio tras descuento: "+precio1 + precio2 + precio3);
		System.out.println("Importe del iva"+importeIva);
		System.out.println("Precio final a pagar: "+precioFinal);
	}

}
