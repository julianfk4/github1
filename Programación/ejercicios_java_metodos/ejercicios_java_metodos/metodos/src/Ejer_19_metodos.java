
import java.util.Scanner;

public class Ejer_19_metodos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;
        System.out.println("Calculador de areas: circulo, triangulo, rectangulo o cuadrado");
        String eleccion = sc.next();
        char letra = eleccion.charAt(3);
        do
            if(letra=='c' || letra == 'C'){
                System.out.println("¿?Cuanto mide el radio?");
                int radio = sc.nextInt();
                circulo(radio);
            }else if(letra=='a' || letra == 'A'){
                System.out.println("¿Cuanto mide la base, y la altura?");
                int base=sc.nextInt();
                int altur=sc.nextInt();
                triangulo(base, altur);
            }else if(letra=='t' || letra == 'T'){
                System.out.println("¿Cuanto mide cada lado?");
                int lado1=sc.nextInt();
                int lado2=sc.nextInt();
                rectangulo(lado1, lado2);
            }else if(letra=='d' || letra == 'D'){
                System.out.println("¿Cuanto mide el lado?");
                int lado=sc.nextInt();
                cuadrado(lado);
            }

        while (letra!='c' && letra =='C' && letra =='a'&&letra!='A'&& letra =='t'&&letra!='T'&& letra =='d'&&letra!='D');
        sc.close();
        }
    public static void circulo(int radio){
            double area= Math.PI*Math.pow(radio, 2);
            System.out.println(area+" de area");
    }
    public static void triangulo(int base, int altur){
        double area= (base*altur)/2;
            System.out.println(area+" de area");
    }
    public static void rectangulo(int lado1, int lado2){
        double area= lado1*lado2;
            System.out.println(area+" de area");
    }
    public static void cuadrado(int lado){
        double area= Math.pow(lado, 2);
            System.out.println(area+" de area");
    }

}
