package Ejer_3_julian;
import java.util.Scanner;
public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelicula pelicula1 = new Pelicula("Titanic", 195, "Romance", "James Cameron");
        Pelicula pelicula2 = new Pelicula("Inception", 148, "Sci-Fi", "Christopher Nolan");
        Pelicula pelicula3 = new Pelicula("La la land", 120, "Romance", "Damian Chazelle");
        Pelicula pelicula4 = new Pelicula("Avengers", 143, "Action", "Joss Whedon");
        Pelicula pelicula5 = new Pelicula("Interestellar", 120, "Sci-Fi", "Christopher Nolan");
        Pelicula[] peliculasarray = {pelicula1, pelicula2, pelicula3, pelicula4, pelicula5};
        System.out.println("Bienvenido, hay disponibles 5 pelis, ¿Pulse 1 si quiere revisar sus titulos?");
        int respuesta=sc.nextInt();
        if (respuesta==1) {
            for (Pelicula pelicula : peliculasarray) {
            System.out.println("Nombre: " + pelicula.getTitulo());
            }
        }
        int respuesta2 = 6;
        while (respuesta2 != 9) {
            System.out.println("Pulse 6 para comparar duraciones de pelis, 7 si trata de devolver una peli y 8 si desea comprar una");
            respuesta2=sc.nextInt();
            sc.nextLine();
            if (respuesta2 ==7) {
                System.out.println("Escriba el titulo de la peli que desea comprar sin faltas y con mayuscula");
                String peli=sc.nextLine();
                for (Pelicula pelicula : peliculasarray) {
                if (pelicula.getTitulo().equalsIgnoreCase(peli)) {
                    pelicula.comprar();
                }
                }
            }else if (respuesta2==8) {
                System.out.println("Escriba el titulo de la peli que desea devolver sin faltas y con mayuscula");
                
                String peli=sc.nextLine();
                for (Pelicula pelicula : peliculasarray) {
                if (pelicula.getTitulo().equalsIgnoreCase(peli)) {
                    pelicula.devolucion();
                }
            }
            }else if (respuesta2==6) {
                System.out.println("Ingrese el título de la primera película:");
                String tituloPelicula1 = sc.nextLine();

                System.out.println("Ingrese el título de la segunda película:");
                String tituloPelicula2 = sc.nextLine();

                
                // Busca las películas en el array
                for (Pelicula pelicula : peliculasarray) {
                    if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula1)) {
                        pelicula1 = pelicula;
                    }
                    if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula2)) {
                        pelicula2 = pelicula;
                    }
                }

                
                if (pelicula1 != null && pelicula2 != null) {
                    // Compara las duraciones
                    if (pelicula1.getDuracion() > pelicula2.getDuracion()) {
                        System.out.println("La película " + pelicula1.getTitulo() + " es más larga.");
                    } else if (pelicula1.getDuracion() < pelicula2.getDuracion()) {
                        System.out.println("La película " + pelicula2.getTitulo() + " es más larga.");
                    } else {
                        System.out.println("Ambas películas tienen la misma duración.");
                    }
                } else {
                    System.out.println("No se encontraron todas las películas ingresadas.");
                }
        
        
            }
}
}
}
