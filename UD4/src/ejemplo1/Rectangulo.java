package ejemplo1;
/*
Crear una clase Rectangulo con:
base
altura
metodo calcularArea()
metodo calcularPerimetro()

 */
public class Rectangulo {
    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calcularArea(){
        double area = base*altura;
        System.out.println("Area: "+area);
    }

    public void calcularPerimetro(){
        double perimetro = 2*(base*altura);
        System.out.println("Perímetro: "+ perimetro);
    }
}