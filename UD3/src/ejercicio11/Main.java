package ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Termostato t1 = new Termostato();
		
		t1.temperaturaActual = 20;
		t1.aumentarTemperatura(10);
		System.out.println(t1.estado());
		t1.disminuirTemperatura(30);
		System.out.println(t1.estado());
		t1.aumentarTemperatura(15);
		System.out.println(t1.estado());
		t1.aumentarTemperatura(10);
		System.out.println(t1.estado());
		t1.disminuirTemperatura(30);
		System.out.println(t1.estado());
		t1.aumentarTemperatura(15);
		System.out.println(t1.estado());
	}

}
