package ejercicio5;
/*Crear clase Impresora con método sobrecargado imprimir():
imprimir(String)
imprimir(int)
imprimir(double)
*/
public class Impresora {
	
    public void imprimir(String texto) {
        System.out.println("Imprimiendo texto: " + texto);
    }

    public void imprimir(int numero) {
        System.out.println("Imprimiendo número entero: " + numero);
    }

    public void imprimir(double numero) {
        System.out.println("Imprimiendo número decimal: " + numero);
    }
}
