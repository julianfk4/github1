import java.util.Scanner;
public class Ejer_05_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tenemos un cilindro, quieres hacer su area o su volumen");
        String eleccion = sc.nextLine();
        char letra = eleccion.charAt(0);
        int altura=10;
        int radio=5;
        do
            if(letra=='a' || letra == 'A'){
                double areacil=area(radio, altura);
                System.out.println(areacil);
            }else if(letra=='v' || letra == 'V'){
                double volcil=volumen(radio, altura);
                System.out.println(volcil);
            }
        while (letra!='v' && letra =='a' && letra =='A'&&letra!='V');
        
        
        sc.close();
    }

    public static double area(int altura,int radio){
        
        return 2*Math.PI*radio*(altura+radio);
        
    }
    public static double volumen(int altura,int radio){
        return Math.PI*Math.pow(radio, 2)*altura;
    }
}
