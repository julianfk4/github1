package Ejer_3_clases;

import java.util.Scanner;

public class Ejer_3_clases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas llegaste a la biblioteca que deseas hacer, pulse 1 para ver los datos de un libro, 2 para devolver un libro, 3 para llevarse uno y 4 para salir de la biblioteca");
        Libro nuevolibro = new Libro("Quijote", "Cervantes", 5, 0);
        int respuesta=sc.nextInt();
        while(respuesta!=4){
        
            if (respuesta==1) {
                nuevolibro.mostrar();
            }else if (respuesta==2) {
                nuevolibro.devolver();
            }else{
                nuevolibro.prestar();
            }
        }
    }
}
