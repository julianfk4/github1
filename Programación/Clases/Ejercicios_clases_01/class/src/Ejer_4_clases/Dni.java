package Ejer_4_clases;

public class Dni {
    private int numero;
    private char letra;


    public Dni(int numero){
this.numero=numero;

}

public Dni(int numero, char letusuario){
    this.numero=numero;
    this.letra=letusuario;
}

    public char let(){
        
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numero % 23;
        
        char nletra= letra[resto];
        return nletra;
    }
    public void mostrar(){
        char letusuario=this.letra;
        System.out.println(numero+"-"+letusuario);
    }
}
