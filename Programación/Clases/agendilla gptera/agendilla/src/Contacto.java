public class Contacto {
        private static int contadorId = 0;
        private int id;
        private String nombre;
        private String telefono;
    
        // Constructor con parámetros nombre y teléfono
        public Contacto(String nombre, String telefono) {
            this.id = ++contadorId;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    
        // Constructor con parámetro Nombre (teléfono por defecto será 0)
        public Contacto(String nombre) {
            this(nombre, "0");
        }
    
        // Getters y setters
        public int getId() {
            return id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getTelefono() {
            return telefono;
        }
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    
        // Método esIgual
        public boolean esIgual(String otroNombre) {
            return this.nombre.equals(otroNombre);
        }
    
        // Método imprimir
        public void imprimir() {
            System.out.println("ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono);
        }
    }