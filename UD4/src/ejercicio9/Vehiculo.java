package ejercicio9;
/*Crear una clase Vehiculo con los siguientes atributos privados:
marca
modelo
velocidad
Implementa:
Getters y setters para todos los atributos.
acelerar(int cantidad) → aumenta la velocidad.
frenar(int cantidad) → reduce la velocidad sin permitir valores negativos.
mostrarDatos() → muestra toda la información del vehículo.*/

public class Vehiculo {
	private String marca;
	private String modelo;
	private int velocidad;
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public int acelerar(int cantidad) {
		return (velocidad+=cantidad);
	}
	
	public void frenar(int cantidad) {
		velocidad-=cantidad;
		if(velocidad<0) {
			velocidad = 0;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("--------DATOS---------");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidad: " + velocidad);	
	}

}
