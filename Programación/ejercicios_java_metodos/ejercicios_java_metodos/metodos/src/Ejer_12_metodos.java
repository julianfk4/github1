import java.util.Random;
import java.util.Scanner;

public class Ejer_12_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int resultado =aleatoriedad(a, n);
        System.out.println(resultado);
        
        
        sc.close();
    }
    public static int aleatoriedad(int a, int n){
        Random rnd = new Random();
        System.out.println("");
        int eleccion= rnd.nextInt(0,2);
        if(eleccion==1){
            return n;
        }else{
            return a;
        }
        
    }

}
