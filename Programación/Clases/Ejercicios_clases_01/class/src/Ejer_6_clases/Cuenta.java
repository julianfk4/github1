package Ejer_6_clases;

public class Cuenta {
    String nombre, numcuenta;
    double tipoInteres, saldo;

    public void ingresar(double cantidad){
        if (cantidad <=0) {
            System.out.println("mayor que 0 para hacer ingreso");
        }else{
            this.saldo +=cantidad;
            System.out.println("Saldo actualizado");
    }

    }
    public void retirar(double cantidad){
        if (this.saldo >=cantidad) {
            System.out.println("mayor que 0 para hacer ingreso");
        }else{
            this.saldo +=cantidad;
            System.out.println("Saldo actualizado");
    }
    }
    public void transferencia(double cantidad){
        if (this.saldo >=cantidad) {
            System.out.println("mayor que 0 para hacer ingreso");
        }else{
            this.saldo +=cantidad;
            System.out.println("Saldo actualizado");


            
        }
}
}
