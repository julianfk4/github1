public class Caja {

    double alto, ancho, largo;

    public Caja (double high, double width, double large) {
        alto = high;
        ancho= width;
        largo = large;
    }

    public double calcularVolumen(){
        double volumen = alto*ancho*largo;
        return volumen;
    }

    public double sumarlados(){
        double suma = alto + ancho + largo;
        return suma;
    }

    
}
