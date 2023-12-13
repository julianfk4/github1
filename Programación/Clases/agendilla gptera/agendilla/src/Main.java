import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = null;

        while (true) {
            System.out.println("\n*** Menú ***");
            System.out.println("1. Crear nueva agenda");
            System.out.println("2. Añadir contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar lista de contactos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tamaño de la agenda: ");
                    int tamanoAgenda = scanner.nextInt();
                    agenda = new Agenda(tamanoAgenda);
                    System.out.println("Agenda creada correctamente.");
                    break;
                case 2:
                    if (agenda == null) {
                        System.out.println("Primero, cree una agenda.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el teléfono del contacto: ");
                        String telefono = scanner.nextLine();
                        Contacto nuevoContacto = new Contacto(nombre, telefono);
                        agenda.añadirContacto(nuevoContacto);
                    }
                    break;
                case 3:
                    if (agenda == null) {
                        System.out.println("Primero, cree una agenda.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        Contacto contactoBuscado = agenda.buscarContacto(nombreBuscar);
                        if (contactoBuscado != null) {
                            System.out.println("Contacto encontrado:");
                            contactoBuscado.imprimir();
                        } else {
                            System.out.println("No se encontró el contacto.");
                        }
                    }
                    break;
                case 4:
                    if (agenda == null) {
                        System.out.println("Primero, cree una agenda.");
                    } else {
                        System.out.print("Ingrese el nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        agenda.eliminarContacto(nombreEliminar);
                    }
                    break;
                case 5:
                    if (agenda == null) {
                        System.out.println("Primero, cree una agenda.");
                    } else {
                        System.out.println("Lista de contactos:");
                        agenda.listaContactos();
                    }
                    break;
                    case 6:
                    System.out.println("adios");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
                    }
                }
        }
}
