import java.util.Random;
import java.util.Scanner;

public class Ejer_13_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros?");
        int n=sc.nextInt();
        System.out.println("¿Numero minimo en el aleatorizador?");
        int c=sc.nextInt();
         System.out.println("¿Numero maximo en el aleatorizador?");
        int a=sc.nextInt();
        aletorizador(a, n, c);
        
        sc.close();
    }
    public static void aletorizador(int a, int n, int c){
        Random rnd = new Random();
        int num;
        System.out.println("");
        for(int i=0;i<n;i++){
            num = rnd.nextInt(c,a+1);
            System.out.println(num);
        }
    }

}
