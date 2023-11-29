package Ejer_5_clases;

public class Cafetera {
    private int capmax;
    private int capact;

    public Cafetera(){
        this.capact=0;
        this.capmax=1000;
    }
    public Cafetera(int capmax){
        this.capact=capact;
        this.capmax=capmax;
    }
    public Cafetera(int capmax, int capact){
        this.capmax=capmax;
        if (capact>capmax) {
            this.capact=capmax;
        }else{
            this.capact=capact;
        }
    }

    public void servir(int capacidad){
        if (capact>=capacidad) {
            capact-=capacidad;
        }else{
            capacidad = capact;
            System.out.println("no se lleno, su capacidad: "+capacidad);
            capact=0;
        }
    }
    public void vaciar(){
        capact=0;
    }
    public void agregar(int cantidad){
        cantidad +=capmax;
        if (capact>capmax) {
            capact=capmax;
        }
    }


}
