package Ejer_1_clasesopc;

public class Empleado {
    int sueldo_base, precioporhora_extra, horas_extras, irpf, numhijos;
    boolean casado;
    String nif;

    Empleado Juan=new Empleado(){
        this.sueldo_base=sueldo_base;
        this.precioporhora_extra=precioporhora_extra;
        this.numhijos=numhijos;
        this.nif=nif;
        this.irpf=irpf;
        this.casado=casado;
        this.horas_extras=horas_extras;
    }
}
