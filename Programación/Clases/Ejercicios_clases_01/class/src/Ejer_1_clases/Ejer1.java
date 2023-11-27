package Ejer_1_clases;

public class Ejer1 {
    public static void main(String[] args) {
        Circulo1 circu =new Circulo1(7);
        circu.radio=7;
        Circulo1 circu2 = new Circulo1(5);
        circu2.radio=5;
    }
    public static double area(double radio){

        return Math.PI*Math.pow(radio, 2);
    }
    public static double perimetro(double radio){
        return 2*Math.PI*radio;
    }
}
