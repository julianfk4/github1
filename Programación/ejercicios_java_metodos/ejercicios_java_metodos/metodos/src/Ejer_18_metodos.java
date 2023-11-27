import java.util.Scanner;

public class Ejer_18_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n=sc.nextInt();
        } while (n<0);
        
        boolean resultado =primo(n);
        if(resultado){
            System.out.println("Es primo");
        }else{
            System.out.println("no es primo");
        }
        
        
        
        sc.close();
    }
    public static boolean primo(int n){
        boolean primor=true;
        System.out.println("");
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return primor;
        
    }

}
