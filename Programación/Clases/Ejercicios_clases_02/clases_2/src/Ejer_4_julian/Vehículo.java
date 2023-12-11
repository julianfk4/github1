package Ejer_4_julian;

class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String fechaMatriculacion;
    private String color;
    private String tipoCombustible;
    private double peso;
    private double volumen;
    private int numRuedas;
    private int numPasajeros;
    private DNI dniTitular;
    private boolean pasajerosEnFerry;
    private boolean cargadoEnFerry;

    // Constructor por defecto
    public Vehiculo() {
        // Inicialización por defecto o valores nulos
    }

    // Constructor con todos los datos menos la presencia de pasajeros
    public Vehiculo(String marca, String modelo, String matricula, String fechaMatriculacion,
                    String color, String tipoCombustible, double peso, double volumen,
                    int numRuedas, int numPasajeros, DNI dniTitular) {
        // Inicializar variables con los parámetros proporcionados
    }

    // Constructor con todos los datos
    public Vehiculo(String marca, String modelo, String matricula, String fechaMatriculacion,
                    String color, String tipoCombustible, double peso, double volumen,
                    int numRuedas, int numPasajeros, DNI dniTitular,
                    boolean pasajerosEnFerry, boolean cargadoEnFerry) {
        // Inicializar variables con los parámetros proporcionados
    }

    // Getters y setters (uno de ejemplo)
    public boolean isPasajerosEnFerry() {
        return pasajerosEnFerry;
    }

    public void setPasajerosEnFerry(boolean pasajerosEnFerry) {
        this.pasajerosEnFerry = pasajerosEnFerry;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public DNI getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(DNI dniTitular) {
        this.dniTitular = dniTitular;
    }

    public boolean isCargadoEnFerry() {
        return cargadoEnFerry;
    }

    public void setCargadoEnFerry(boolean cargadoEnFerry) {
        this.cargadoEnFerry = cargadoEnFerry;
    }
    // Método para imprimir los datos
    public void imprimirDatos() {
        System.out.println("DNI: " + dniTitular.toString());
        System.out.println(marca + " " + modelo + " | Matrícula: " + matricula + " | Fecha de matriculación: " + fechaMatriculacion);
        System.out.println(color + " - " + peso + " - " + volumen + " - " + numRuedas + " - " + tipoCombustible);
        System.out.println("No pasajeros: " + numPasajeros + " - " + (pasajerosEnFerry ? "Sí" : "No") + " vienen en el ferry");
    }
}
