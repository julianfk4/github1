import java.util.Scanner;

public class Contacto {

    private int id, num_telef;
    private String nombre;
    
    public Contacto(String nombre,int num_telef){
        this.nombre=nombre;
        this.num_telef=num_telef;
    }

    public Contacto(String nombre){
        this.nombre=nombre;
        this.num_telef=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_telef() {
        return num_telef;
    }

    public void setNum_telef(int num_telef) {
        this.num_telef = num_telef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esIgual(String nombre){
        Scanner sc = new Scanner(System.in);
        boolean esIgual=true;
        String nombre1= sc.nextLine();
        if(nombre){
            esIgual=false;
        }

        return esIgual;
    }
}
