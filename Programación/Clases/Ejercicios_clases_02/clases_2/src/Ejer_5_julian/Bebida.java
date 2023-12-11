package Ejer_5_julian;

public class Bebida {
    private int id;
    private double canLit, precio;
    private String tipBebida, marca;
    private boolean esPromocion;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getCanLit() {
        return canLit;
    }
    public void setCanLit(double canLit) {
        this.canLit = canLit;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipBebida() {
        return tipBebida;
    }
    public void setTipBebida(String tipBebida) {
        this.tipBebida = tipBebida;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isEsPromocion() {
        return esPromocion;
    }
    public void setEsPromocion(boolean esPromocion) {
        this.esPromocion = esPromocion;
    }
    
    public Bebida(double canLit, double precio, String tipBebida, String marca, boolean esPromocion) {
        this.canLit = canLit;
        this.precio = precio;
        this.tipBebida = tipBebida;
        this.marca = marca;
        this.esPromocion = esPromocion;
    }
    public Bebida(double canLit, double precio, String tipBebida, String marca) {
        this.canLit = canLit;
        this.precio = precio;
        this.tipBebida = tipBebida;
        this.marca = marca;
        this.esPromocion = false;
    }
}

