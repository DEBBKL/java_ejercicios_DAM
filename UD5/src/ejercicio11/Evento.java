package ejercicio11;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/*Evento con fecha
Crea una clase Evento.
Atributos: nombre y fecha (LocalDate).
Constructor para inicializarlos.
Método diasRestantes() que devuelva 
cuántos días faltan para el evento.
Usa ChronoUnit.*/

public class Evento {
	private String nombre;
	private LocalDate fecha1, fecha2;
	
	public Evento(String nombre) {
		this.setNombre(nombre);
		LocalDate fecha1 = LocalDate.of(2026, 3, 6);
		this.fecha1=fecha1;
		LocalDate fecha2 = LocalDate.of(2026, 4, 6);
		this.fecha2=fecha2;
	}
	
	public void diasRestantes() {
		long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Días restantes: " + dias);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
