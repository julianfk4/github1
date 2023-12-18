package Ejer_1_julian;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eleccion ="A";
        Animal animal1 = new Animal(sc.nextLine(),sc.nextInt(),sc.nextBoolean());
        
        System.out.println("bienvenido a la clínica online");
        System.out.println("Que desea hacer?");
        System.out.println("A) Cambio de nombre a mascota");
        System.out.println("B) Actualizar edad");
        System.out.println("C) Información sobre chip");
        System.out.println("D) Actualización general de informacion");
        System.out.println("F) Salir del sistema");
        
        while (eleccion!="F") {
            eleccion=sc.next();
            switch (eleccion) {
            case "A":
            System.out.println("nuevo nombre");
                String nombre=sc.next();
                animal1.cambiodato(nombre);
                break;
            case "B":
                int edad = sc.nextInt();
                animal1.cambiodato(edad);
                break;
            case "C":
                boolean tieneChip= sc.nextBoolean();
                animal1.cambiodato(tieneChip);
                break;
            case "D":
                animal1.verdato();
                break;
            case "F":
                eleccion= "F";
                break;
        }
        }
        
    }
}
