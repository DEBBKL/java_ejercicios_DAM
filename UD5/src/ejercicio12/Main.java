package ejercicio12;

public class Main {

	public static void main(String[] args) {
		
		double celsius = 25;
		double fahrenheit = Temperatura.celsiusAFahrenheit(celsius);
		
		System.out.println(celsius + " °C = " + fahrenheit + " °F");
		
		
		double f = 77;
		double c = Temperatura.fahrenheitACelsius(f);
		
		System.out.println(f + " °F = " + c + " °C");

	}

}
