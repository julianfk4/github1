package clase_lunes;

public class PersonaEscocesa extends PersonaInglesa{

    private boolean independentista;

    public PersonaEscocesa(String nombre,double libras,boolean independentista){
        super(nombre,pais:"escocia", libras);
        this.independentista = independentista;
    }
    
    public PersonaEscocesa(String nombre, double libras){
        
    }
}
