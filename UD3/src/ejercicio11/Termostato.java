package ejercicio11;
/*Clase Termostato con:
Atributo temperaturaActual
Método aumentarTemperatura(int grados)
Método disminuirTemperatura(int grados)
Método estado():
< 18 → "Hace frío"
18–25 → "Temperatura agradable"
25 → "Hace calor"
En el main:
Simular varios cambios de temperatura
Mostrar el estado después de cada cambio
*/
public class Termostato {
	int temperaturaActual;
	
	public void aumentarTemperatura(int grados) {
		temperaturaActual+=grados;
		System.out.println(temperaturaActual);
	}
	public void disminuirTemperatura(int grados) {
		temperaturaActual-=grados;
		System.out.println(temperaturaActual); 
	}
	
	public String estado() {
		if(temperaturaActual <18) {
			return "Hace frío";
		}else if(temperaturaActual>25) {
			return "Hace calor";
		}else {
			return "Temperatura agradable";
		}
	}
}
