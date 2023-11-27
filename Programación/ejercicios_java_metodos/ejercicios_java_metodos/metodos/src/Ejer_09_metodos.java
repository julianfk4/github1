import java.util.Scanner;
public class Ejer_09_metodos {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int resultado = elevador(a, n);
        System.out.println(resultado);
        sc.close();
        }
    public static int elevador(int a, int n){
        int b=a;
        for (int i = 1; i < n; i++) {
            a=a*b;
        }
            return a;
}
    
}