import java.util.Scanner;

public class Ejer_07_metodos {
    public static void main(String[] args) {
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahora elige que cuenta quieres hacer con estos simbolos( + - / * )");
        
        String sim=sc.nextLine();
        System.out.println("dame dos numeros enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (sim.equals("+")){
            resultado =suma(num2,num1);
        }else if (sim.equals("-")){
            resultado =resta(num2,num1);
        }else if(sim.equals("*")){
            resultado =multiplicacion(num2,num1);
        }else if (sim.equals("/")){
            resultado =division(num2,num1);
        }else{
            resultado=4;
        }
        System.out.println(resultado);
        sc.close();
    }

    public static double suma(int num1,int num2){
        return num1+num2;
    }
    public static double resta(int num1,int num2){
        return num1-num2;
    }
    public static double multiplicacion(int num1,int num2){
        return num1*num2;
    }
    public static double division(int num1,int num2){
        return num1/num2;
    }
    public static void come(){
        System.out.println("hola");
    }
}