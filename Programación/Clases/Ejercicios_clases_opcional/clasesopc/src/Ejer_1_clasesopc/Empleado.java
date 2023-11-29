package Ejer_1_clasesopc;
//command  .//
public class Empleado {
    int sueldo_base, precioporhora_extra, horas_extras, irpf, numhijos;
    boolean casado;
    String nif;
    
    public Empleado(int sueldo_base, int precioporhora_extra, int horas_extras, int irpf, int numhijos, boolean casado,
            String nif) {
        this.sueldo_base = sueldo_base;
        this.precioporhora_extra = precioporhora_extra;
        this.horas_extras = horas_extras;
        this.irpf = irpf;
        this.numhijos = numhijos;
        this.casado = casado;
        this.nif = nif;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public int getPrecioporhora_extra() {
        return precioporhora_extra;
    }

    public void setPrecioporhora_extra(int precioporhora_extra) {
        this.precioporhora_extra = precioporhora_extra;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }

    public int getIrpf() {
        return irpf;
    }

    public void setIrpf(int irpf) {
        this.irpf = irpf;
    }

    public int getNumhijos() {
        return numhijos;
    }

    public void setNumhijos(int numhijos) {
        this.numhijos = numhijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
