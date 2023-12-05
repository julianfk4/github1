package Ejer_2_julian;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;
    private int golesFavor;
    private int golesContra;

    // Constructor con todos los datos
    public Equipo(String nombre, String ciudad, int puntos, int golesFavor, int golesContra) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
    }

    // Constructor con solo nombre y ciudad (puntos y goles por defecto)
    public Equipo(String nombre, String ciudad) {
        this(nombre, ciudad, 0, 0, 0);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    // Método para registrar un partido (versión i)
    public void jugarPartido(boolean haGanado) {
        if (haGanado) {
            puntos += 3;
        } else {
            puntos += 1;
        }
    }

    // Método para registrar un partido (versión ii)
    public void jugarPartido(boolean haGanado, int golesAnotados) {
        if (haGanado) {
            puntos += 3;
        } else {
            puntos += 1;
        }
        golesFavor += golesAnotados;
    }

    // Método para registrar un partido (versión iii)
    public void jugarPartido(boolean haGanado, int golesAnotados, int golesEnContra) {
        if (haGanado) {
            puntos += 3;
        } else {
            puntos += 1;
        }
        golesFavor += golesAnotados;
        golesContra += golesEnContra;
    }
}
