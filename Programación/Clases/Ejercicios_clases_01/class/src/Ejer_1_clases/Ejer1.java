package Ejer_1_clases;

public class Ejer1 {
    public double calcularArea(double radio) {

        return Math.PI * Math.pow(radio, 2);
    }

    
    public double calcularCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
    
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(20);

        
        System.out.println("Círculo 1:");
        System.out.println("Área: " + circulo1.calcularArea() + " cm^2");
        System.out.println("Circunferencia: " + circulo1.calcularCircunferencia() + " cm");

        System.out.println("\nCírculo 2:");
        System.out.println("Área: " + circulo2.calcularArea() + " cm^2");
        System.out.println("Circunferencia: " + circulo2.calcularCircunferencia() + " cm");
    }
}
