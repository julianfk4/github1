public class Agenda {
    private int cantidadContactos;
    protected Contacto[] agenda;
    private static final int TAMANIO_MAXIMO = 100;

    public Agenda(int tamaño) {
        agenda = new Contacto[100];
    }
    public Contacto[] getAgenda() {
        return agenda;
    }
    public void setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }
    
    public void agregarContacto(Contacto nuevoContacto) {
        if (cantidadContactos < TAMANIO_MAXIMO) {
            agenda[cantidadContactos] = nuevoContacto;
            cantidadContactos++;
            nuevoContacto.setId(cantidadContactos);
        } else {
            System.out.println("La agenda está llena. No se puede agregar más contactos.");
        }
    }
    public void eliminarContacto(int id) {
        int indice = buscarIndicePorId(id);
        if (indice != -1) {
            for (int i = indice; i < cantidadContactos - 1; i++) {
                agenda[i] = agenda[i + 1];
                agenda[i].setId(i + 1);
            }

            agenda[cantidadContactos - 1] = null;
            cantidadContactos--;
        } else {
            System.out.println("No se encontró un contacto con el ID proporcionado.");
        }
    }

    private int buscarIndicePorId(int id) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (agenda[i].getId() == id) {
                return i;
            }
        }
        return -1; // Retorna -1 si el ID no se encuentra
    }
    public void mostrarContactos() {
        for (int i = 0; i < cantidadContactos; i++) {
            Contacto contactoActual = agenda[i];
            if (contactoActual != null) {
                System.out.println(contactoActual.getNombre());
            }
        }
    }

}


