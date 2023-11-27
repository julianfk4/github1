import java.util.Scanner;

public class Ejer_14_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angulo=sc.nextInt();
        System.out.println("¿Ángulo?");
        calculador(angulo);
        
        sc.close();
    }
    public static void calculador(double angulo){
        double [] array = new double[3];
        array[0]=Math.cos(angulo);
        array[1]=Math.tan(angulo);
        array[2]=Math.sin(angulo);
        System.out.println("coseno-tangente-seno");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
    }

}
