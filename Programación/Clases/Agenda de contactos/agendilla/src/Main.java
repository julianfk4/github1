import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String nombre2;

        System.out.println("Agenda");
        Agenda agenda1 = new Agenda(100);
        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del contacto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Introduce el número de teléfono: ");
                    int num_telef = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea después de leer el entero

                    Contacto nuevoContacto = new Contacto(nombre, num_telef);
                    agenda1.agregarContacto(nuevoContacto);
                    System.out.println("Contacto agregado:");
                    nuevoContacto.imprimir();
                    break;
                case 2:
                    System.out.print("Introduce el ID del contacto a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea después de leer el entero

                    agenda1.eliminarContacto(idEliminar);
                    break;
                case 3:
                    System.out.println("Lista de contactos:");
                    agenda1.mostrarContactos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione de nuevo.");
            }
        }
    }
}
