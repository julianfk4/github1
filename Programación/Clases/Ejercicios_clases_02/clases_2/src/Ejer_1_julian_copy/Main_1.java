package Ejer_1_julian_copy;

import java.util.Scanner;

public class Main_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Crear una instancia de Animal
        Animal2 miMascota = new Animal2("Firulais", 3, true);

        // Mostrar atributos originales
        System.out.println("Nombre: " + miMascota.getNombre());
        System.out.println("Edad: " + miMascota.getEdad());
        System.out.println("Tiene chip: " + miMascota.isTieneChip());

        // Usar métodos de sobrecarga
        miMascota.cambiarAtributo(sc.nextLine());
        System.out.println("Nuevo nombre: " + miMascota.getNombre());

        miMascota.cambiarAtributo(sc.nextInt());
        System.out.println("Nueva edad: " + miMascota.getEdad());

        miMascota.cambiarAtributo(sc.nextLine());
        System.out.println("Tiene chip: " + miMascota.isTieneChip());

        miMascota.cambiarAtributo("Luna", 2, true);
        System.out.println("Nuevo nombre: " + miMascota.getNombre());
        System.out.println("Nueva edad: " + miMascota.getEdad());
        System.out.println("Tiene chip: " + miMascota.isTieneChip());
    }
}
