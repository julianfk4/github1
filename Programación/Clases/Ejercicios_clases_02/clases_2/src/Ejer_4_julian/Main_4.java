package Ejer_4_julian;

import java.util.Scanner;

public class Main_4 {
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[5];

        // Pedir datos de 5 vehículos
        for (int i = 0; i < 5; i++) {
            // Recoger datos del vehículo
            // ...

            // Crear objeto Vehiculo con los datos recogidos
            vehiculos[i] = new Vehiculo(/* pasar los datos recogidos como argumentos */);
        }

        // Recorrer array y asignar si los pasajeros vienen o no en el ferry
        for (int i = 0; i < 5; i++) {
            System.out.print("¿Los pasajeros vienen en el ferry para el vehículo " + (i + 1) + "? (true/false): ");
            boolean pasajerosEnFerry = sc.nextBoolean();
            vehiculos[i].setPasajerosEnFerry(pasajerosEnFerry);
        }

        // Cargar y descargar un vehículo en el ferry (dos veces)
        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce un DNI para cargar o descargar un vehículo: ");
            // Recoger DNI del usuario

            // Buscar el vehículo en el array por DNI
            // Cambiar su estado (cargadoEnFerry) según sea necesario
        }

        // Imprimir los datos de un vehículo por DNI
        System.out.print("Introduce un DNI para imprimir los datos del vehículo: ");
        // Recoger DNI del usuario

        // Buscar el vehículo en el array por DNI y llamar al método imprimirDatos()
        sc.close();
    }
    
}
}
