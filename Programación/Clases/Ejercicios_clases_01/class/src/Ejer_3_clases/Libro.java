package Ejer_3_clases;

public class Libro {
    public String titulo, autor;
    private int ejemplares, ejemplaresprestados;


    
    public Libro(String titulo,String autor,int ejemplares, int ejemplaresprestados){
    this.titulo=titulo;
    this.autor=autor;
    this.ejemplares=ejemplares;
    this.ejemplaresprestados=ejemplaresprestados;
    }

    public boolean prestar(){
        ejemplares--;
        boolean prestado;
        if (ejemplares<=0){
        return prestado=false;
        }else{
            ejemplaresprestados++;
            return prestado=true;
        }
    }
    public boolean devolver(){
        boolean devuelto;
        if (ejemplaresprestados<=0){
            return devuelto=false;
        }else{
            ejemplares++;
            ejemplaresprestados--;
            return devuelto=true;
        }
    }
    public void mostrar(){
        System.out.println("el titulo es "+titulo+" y fue escrito por "+autor);
    }
}


