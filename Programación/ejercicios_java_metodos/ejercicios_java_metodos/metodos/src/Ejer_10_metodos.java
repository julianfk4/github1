import java.util.Scanner;

public class Ejer_10_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        contador(a, n);
        
        sc.close();
    }
    public static void contador(int a, int n){
        System.out.println("");
        for (int i=a; i < n+1; i++) {
            System.out.println(i);
        }
    }


}
