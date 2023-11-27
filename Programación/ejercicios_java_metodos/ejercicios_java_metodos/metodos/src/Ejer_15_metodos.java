import java.util.Scanner;

public class Ejer_15_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        int resultado =contador(array);
        System.out.println(resultado);
        sc.close();
    }
    public static int contador(int[] array){
        System.out.println("");
        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

}
