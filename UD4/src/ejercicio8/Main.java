package ejercicio8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();

        agenda.agregarContacto("Mengano");
        agenda.agregarContacto("Deborah");
        agenda.agregarContacto("Pepito");

        agenda.mostrarContactos();

        agenda.buscarContacto("Deborah");

        agenda.eliminarContacto("Pepito");

        agenda.mostrarContactos();
    }
}

