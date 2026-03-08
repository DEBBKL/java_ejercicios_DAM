package arraysUnidimensional;
/*Dado un array, generar otro sin elementos repetidos*/

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		String[] nombres = {"Pepe","Eminem","Lolo","Eminem"};
		String[] nombresSinRepeticion = new String[nombres.length];
		int contador = 0;
		int i,j;
		
		for(i = 0;i<nombres.length;i++) {
		
				for(j = 0; j < contador; j++) {
					if(nombres[i].equals(nombresSinRepeticion[j])) {
						break;
					}
				}
				
				if(j==contador) {
					nombresSinRepeticion[contador] = nombres[i];
					contador++;
				}
			}
		System.out.println(Arrays.toString(nombresSinRepeticion));
		
		}
	}


