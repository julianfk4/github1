import java.util.Scanner;

public class Ejer_06_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tenemos un cilindro, quieres hacer su area o su volumen");
        String eleccion = sc.nextLine();
        char letra = eleccion.charAt(0);
        int altura=10;
        int radio=5;
        double[] cilin_array = new double[2];
        do
            if(letra=='a' || letra == 'A'){
                cilin_array[1]=area(radio, altura);

                System.out.println(cilin_array[1]);
            }else if(letra=='v' || letra == 'V'){
                cilin_array[2]=volumen(radio, altura);
                System.out.println(cilin_array[2]);
            }
        while (letra!='v' && letra =='a' && letra =='A'&&letra!='V');
        
        
        sc.close();
    }

    public static double area(int altura,int radio){
        
        return 2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
        
    }
    public static double volumen(int altura,int radio){

        return Math.PI*Math.pow(radio, 2)*altura;
        
    }

}
