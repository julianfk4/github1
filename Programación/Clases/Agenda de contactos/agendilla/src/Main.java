import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String nombre2;

        System.out.println("Agenda");
        Agenda agenda1 = new Agenda(100);

        System.out.println("introduce contacto");

        Contacto contacto1 = new Contacto(nombre2=sc.nextLine(), sc.nextInt());
        
        if (contacto1.esIgual(nombre2)){
            System.out.println("hola");
        }
    }
}
