import java.util.Random;
import java.util.Scanner;

public class Ejer_16_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] array= new int[5];
        for(int i=0;i<5;i++){
            array[i]=rnd.nextInt(0,5);
        }
        int n=sc.nextInt();
        boolean resultados =buscador(array, n);
        if (resultados){
            System.out.println("encontrado");
        }else{
            System.out.println("no encontrado");
        }

        sc.close();
    }
    public static boolean buscador(int[] array, int n){
        Random rnd = new Random();
        boolean resultado=false;
        System.out.println("");
        for(int i =0;i<5;i++){
            if (array[i]==n){
                resultado=true;
                break;
            }else{
                resultado=false;
            }
        }
        return resultado;
        
    }

}
