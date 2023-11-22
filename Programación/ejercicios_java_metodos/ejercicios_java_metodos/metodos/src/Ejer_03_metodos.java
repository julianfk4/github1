
import java.util.Scanner;
public class Ejer_03_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int resultado =modulo(num1, num2);
        if (resultado==0) {
            System.out.println("eran iguales");
        }else{
            System.out.println(resultado);
        }
        
        sc.close();
    }

    public static int modulo(int num1,int num2){
        System.out.println("maximo");
        if (num1>num2) {
            return num1;
        }else if(num2>num1){
            return num2;
        }else{
            return 0;
        }
        
    }

}

