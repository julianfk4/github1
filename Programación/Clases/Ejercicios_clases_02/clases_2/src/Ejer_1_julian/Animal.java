package Ejer_1_julian;

public class Animal {
    
    private String nombre;
    private int edad;
    private boolean tieneChip;

    public Animal(String nombre, int edad, boolean tieneChip){
        this.edad=edad;
        this.nombre=nombre;
        this.tieneChip=tieneChip;
    }
            //Getters Y Setters//
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

            //METODOS//
    public void cambiodato(String nombre){
        this.nombre = nombre;
        System.out.println(nombre);
    }

    public void cambiodato(int edad){
        
        this.edad = edad;
    }
    public void cambiodato(boolean tieneChip){
        this.tieneChip=tieneChip;
        
    }
    public void verdato(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(tieneChip);
    }

}
