package Ejer_3_julian;

public class Pelicula {
    private String titulo;
    private int duracion;
    private String genero;
    private String director;
    private boolean comprado;

    // Constructor por defecto
    public Pelicula() {
        this.comprado = false;
    }

    // Constructor con título y director
    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
        this.comprado = false;
    }

    // Constructor con todos los atributos excepto comprado
    public Pelicula(String titulo, int duracion, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
        this.comprado = false;
    }

    // Métodos getter y setter para todas las variables
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isComprado() {
        return comprado;
    }

    // Métodos
    public void comprar() {
        if (!comprado) {
            comprado = true;
            System.out.println("La película ha sido comprada.");
        } else {
            System.out.println("La película ya ha sido comprada anteriormente.");
        }
    }

   
    public void devolucion() {
        if (comprado) {
            comprado = false;
            System.out.println("La película ha sido devuelta.");
        } else {
            System.out.println("La película no puede ser devuelta porque no fue comprada.");
        }
    }

   
    public boolean compareTo(Pelicula otraPelicula) {
        return this.duracion > otraPelicula.getDuracion();
    }
}
