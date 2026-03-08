package Ejercicios;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese el precio del producto");
			double precioProductos = sc.nextDouble();
			System.out.println("Ingrese la cantidad de productos");
			double cantidadProductos = 0;
			double precioTotal = precioProductos * cantidadProductos;
			
			final double DESCUENTO = 0.15;
			double descuentoAplicado = 0;
			double  precioFinal = precioTotal *descuentoAplicado;
			double precioFinal1 = precioTotal * DESCUENTO;
			int precioTotalInt = (int) precioTotal;
			
			System.out.println("Precio del producto: " + precioProductos);
			System.out.println("Cantidad de productos: " + cantidadProductos);
		}
		
	}

}
