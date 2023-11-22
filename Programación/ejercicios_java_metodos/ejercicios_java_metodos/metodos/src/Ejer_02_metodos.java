import java.util.Scanner;
public class Ejer_02_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int veces=sc.nextInt();
        modulo(veces);
        sc.close();
    }

    public static void modulo(int veces){
        
        System.out.println("doble es "+veces*2);
        
    }

}

