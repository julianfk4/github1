package Ejer_4_clases;

import java.util.Scanner;

public class Ejer_4_clases {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime tu numero de  DNI");
        int numero;
        
        do {
            numero=sc.nextInt();
        } while (numero<9999999 || numero>99999999);

        Dni usuario = new Dni(numero);
        char letusuario =usuario.let();
        Dni usuaDni = new Dni(numero, letusuario);
        usuaDni.mostrar();
    }
}
