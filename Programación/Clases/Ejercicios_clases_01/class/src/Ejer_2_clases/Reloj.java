package Ejer_2_clases;

public class Reloj {
    int horas, minutos, segundos;

    public Reloj(){
        this.horas= 0;
        this.minutos= 0;
        this.segundos= 0;
    }
    public Reloj(int horas,int  minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public void impresor(){
        System.out.println(horas+":"+minutos+":"+segundos);

    }
    public void impresor2(){
        if (horas>=12) {
            horas =horas-12;
            System.out.println(horas+":"+minutos+":"+segundos+"pm");
        }else{
        System.out.println(horas+":"+minutos+":"+segundos+"am");
        }
    }
}
