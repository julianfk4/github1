package Ejer_3_clases;

public class Libro {
    private String titulo, autor;
    private int ejemplares, ejemplaresprestados;


    public Libro(String titulo,String autor,int ejemplares, int ejemplaresprestados){

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
    
}


