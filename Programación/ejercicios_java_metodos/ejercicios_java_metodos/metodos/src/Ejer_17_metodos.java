import java.util.Scanner;

public class Ejer_17_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n=sc.nextInt();
        } while (n<0);
        
        int resultado =cifras(n);
        System.out.println(resultado);
        
        
        sc.close();
    }
    public static int cifras( int n){
        int numn=0;
        int m=9;
        int longi=1;
        boolean sigue=true;
        System.out.println("");
        while (sigue) {
            if (n>m){
                
                m=m*10+9;
                longi++;
            }else{
                sigue=false;

            }
        }
        return longi;
    }

}
