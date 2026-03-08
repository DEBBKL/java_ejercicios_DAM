public class Ejemplo {
    public static void main(String[] args) {
        System.out.println(multiplicar(2,3));
        System.out.println(multiplicar(2.5,10.6));
    }

    static int multiplicar (int numero,int cantidad){
        return numero*cantidad;
    }

    static double multiplicar (double numero, double numero2){
        return numero+numero2;
    }
} 
