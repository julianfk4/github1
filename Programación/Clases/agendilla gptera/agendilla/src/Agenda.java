
    public class Agenda {
        private Contacto[] contactos;
    
        // Constructor por defecto, inicializa el array a un tamaño 100
        public Agenda() {
            this(100);
        }
    
        // Constructor que recibe un tamaño de huecos para la agenda e inicializa el array con ese tamaño
        public Agenda(int tamano) {
            contactos = new Contacto[tamano];
        }
    
        // Método existeContacto
        public boolean existeContacto(String nombre) {
            for (Contacto contacto : contactos) {
                if (contacto != null && contacto.esIgual(nombre)) {
                    return true;
                }
            }
            return false;
        }
    
        // Método siguienteHuecoLibre
        public int siguienteHuecoLibre() {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    return i;
                }
            }
            return -1; // La agenda está llena
        }
    
        // Método numHuecosLibres
        public int numHuecosLibres() {
            int huecosLibres = 0;
            for (Contacto contacto : contactos) {
                if (contacto == null) {
                    huecosLibres++;
                }
            }
            return huecosLibres;
        }
    
        // Método añadirContacto
        public void añadirContacto(Contacto c) {
            int indice = siguienteHuecoLibre();
            if (indice != -1) {
                contactos[indice] = c;
                System.out.println("Contacto añadido correctamente.");
            } else {
                System.out.println("La agenda está llena. No se puede añadir el contacto.");
            }
        }
    
        // Método buscarContacto
        public Contacto buscarContacto(String nombre) {
            for (Contacto contacto : contactos) {
                if (contacto != null && contacto.esIgual(nombre)) {
                    return contacto;
                }
            }
            return null; // No se encontró el contacto
        }
    
        // Método eliminarContacto
        public void eliminarContacto(String nombre) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null && contactos[i].esIgual(nombre)) {
                    contactos[i] = null;
                    System.out.println("Contacto eliminado correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró el contacto.");
        }
    
        // Método imprimirContacto
        public void imprimirContacto(String nombre) {
            Contacto contacto = buscarContacto(nombre);
            if (contacto != null) {
                contacto.imprimir();
            } else {
                System.out.println("No se encontró el contacto.");
            }
        }
    
        // Método listaContactos
        public void listaContactos() {
            for (Contacto contacto : contactos) {
                if (contacto != null) {
                    contacto.imprimir();
                }
            }
        }
    }
