package Ejer_2_clases;
import java.util.Scanner;
public class Ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una hora exacta, empezando por horas y terminando por segundos");

        Reloj cuenta = new Reloj(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        cuenta.impresor();
        cuenta.impresor2();


    }
}
