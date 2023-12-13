public class Contacto {

    private int id;
    private int num_telef;
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

    public boolean esIgual(String nombre) {
        return this.nombre.equals(nombre);
    }

    public void imprimir() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + num_telef);
    }

}

