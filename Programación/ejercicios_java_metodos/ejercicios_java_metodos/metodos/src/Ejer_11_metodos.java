import java.util.Scanner;

public class Ejer_11_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        impares(n);
        
        sc.close();
    }
    public static void impares(int n){
        System.out.println("");
        int i =0;
        int a =1;
        do {
            
            if(a%2==0){
                a++;
            }else{
                i++;
                System.out.println(a);
                a++;
            }
            
        } while (i<n);
    }

}
