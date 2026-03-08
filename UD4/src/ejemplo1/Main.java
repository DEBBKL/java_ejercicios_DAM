package ejemplo1;

public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();

        r.setAltura(9.9);
        r.setBase(9.9);
        System.out.println(r.getBase());
        System.out.println(r.getAltura());

        r.calcularArea();
        r.calcularPerimetro();

    }
}