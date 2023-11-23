import java.util.Scanner;

public class Ejer_07_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces=sc.nextInt();
        suma(veces);
        sc.close();
    }

    public static double suma(int veces){
        for(int i=0;i<veces;i++){
            System.out.println("modulo ejecutandose");
        }
    }
    public static double resta(int veces){
        for(int i=0;i<veces;i++){
            System.out.println("modulo ejecutandose");
        }
    }
    public static double multiplicacion(int veces){
        for(int i=0;i<veces;i++){
            System.out.println("modulo ejecutandose");
        }
    }
    public static double division(int veces){
        for(int i=0;i<veces;i++){
            System.out.println("modulo ejecutandose");
        }
    }
}
