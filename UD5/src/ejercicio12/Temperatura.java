package ejercicio12;
/*Conversor de temperatura
Crea una clase Temperatura.
Implementa dos métodos estáticos:
celsiusAFahrenheit(double c)
fahrenheitACelsius(double f)
*/

public class Temperatura {
		
	public Temperatura() {
		
	}
	
	public static double celsiusAFahrenheit(double c) {
		return (c*9/5)+32;
		}
	
	public static double fahrenheitACelsius(double f) {
		return (f - 32)*(5/9);
		}
}
