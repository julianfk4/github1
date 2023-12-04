package Ejer_1_julian_copy;

public class Animal2 {
 
     private String nombre;
    private int edad;
    private boolean tieneChip;

    // Constructor
    public Animal2(String nombre, int edad, boolean tieneChip) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneChip = tieneChip;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    // Métodos de sobrecarga
    public void cambiarAtributo(String nuevoNombre) {
        setNombre(nuevoNombre);
    }

    public void cambiarAtributo(int nuevaEdad) {
        setEdad(nuevaEdad);
    }

    public void cambiarAtributo(boolean nuevoTieneChip) {
        setTieneChip(nuevoTieneChip);
    }

    public void cambiarAtributo(String nuevoNombre, int nuevaEdad, boolean nuevoTieneChip) {
        setNombre(nuevoNombre);
        setEdad(nuevaEdad);
        setTieneChip(nuevoTieneChip);
    }

   
}



