import java.util.Scanner;
public class Ejer_09_metodos {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;
        System.out.println("Indique cuantos euros quieres cambiar");
        euros=sc.nextInt();
        System.err.println("¿a que moneda desea cambiarlos?");
        String eleccion = sc.next();
        char letra = eleccion.charAt(0);
        do
            if(letra=='l' || letra == 'L'){
                libras(euros);
            }else if(letra=='d' || letra == 'D'){
                dolares(euros);
            }else if(letra=='y' || letra == 'Y'){
                yenes(euros);
            }
        while (letra!='y' && letra =='Y' && letra =='D'&&letra!='d'&& letra =='l'&&letra!='L');
        }
    public static void libras(double euros){
            System.out.println("hoal");
    }
    public static void dolares(double euros){
        System.out.println("hola");
    }
    public static void yenes(double euros){
        System.out.println("adios");
    }
}