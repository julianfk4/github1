import java.util.Scanner;
public class Ejer_01_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces=sc.nextInt();
        modulo(veces);
        sc.close();
    }

    public static void modulo(int veces){
        for(int i=0;i<veces;i++){
            System.out.println("modulo ejecutandose");
        }
    }

}
