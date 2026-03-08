package Ejemplo2;

public class CuentaBancaria {
    String titular;
    double saldo;

    public void ingresar(double cantidad){
        if (cantidad >0 ){
            saldo+=cantidad;
            System.out.println("Ingreso Realizado de :"+ cantidad);
            System.out.println("Saldo Actual: "+saldo);
        }else {

        }
    }

    public void retirar(double cantidad){
        if (cantidad >0 ){
            if (cantidad<=saldo){
                saldo-=cantidad;
                System.out.println("Retiro realizado de :"+ cantidad);
                System.out.println("Saldo Actual: "+saldo);
            } else{
                System.out.println("FONDOS INSUFICIENTES");
            }

        } else {
            System.out.println("Número erróneo");
        }
    }



}