package Ejer_3_julian;

public class Main_3 {
    public static void main(String[] args) {
        // Ejemplo de uso
        Pelicula pelicula1 = new Pelicula("Titanic", 195, "Romance", "James Cameron");
        Pelicula pelicula2 = new Pelicula("Inception", 148, "Sci-Fi", "Christopher Nolan");

        pelicula1.comprar();
        pelicula1.devolucion();

        pelicula2.comprar();
        pelicula2.devolucion();

        boolean mayorDuracion = pelicula1.compareTo(pelicula2);
        System.out.println("La película 1 tiene mayor duración que la película 2: " + mayorDuracion);
    }
}
