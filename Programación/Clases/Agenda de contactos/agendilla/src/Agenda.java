public class Agenda {
    protected Contacto[] agenda;
    int tamaño =100;
    public Agenda(int tamaño) {
        agenda = new Contacto[100];
    }
    public Contacto[] getAgenda() {
        return agenda;
    }
    public void setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }
    

}


