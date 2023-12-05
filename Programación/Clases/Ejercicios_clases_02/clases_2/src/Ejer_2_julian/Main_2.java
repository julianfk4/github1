package Ejer_2_julian;

public class Main_2 {
    public static void main(String[] args) {
        // Crear un equipo usando el primer constructor
        Equipo equipo1 = new Equipo("Equipo A", "Ciudad A", 0, 0, 0);

        // Imprimir información del equipo
        System.out.println("Equipo 1:");
        System.out.println("Nombre: " + equipo1.getNombre());
        System.out.println("Ciudad: " + equipo1.getCiudad());
        System.out.println("Puntos: " + equipo1.getPuntos());
        System.out.println("Goles a favor: " + equipo1.getGolesFavor());
        System.out.println("Goles en contra: " + equipo1.getGolesContra());
        System.out.println();

        // Crear un equipo usando el segundo constructor
        Equipo equipo2 = new Equipo("Equipo B", "Ciudad B");

        // Imprimir información del equipo
        System.out.println("Equipo 2:");
        System.out.println("Nombre: " + equipo2.getNombre());
        System.out.println("Ciudad: " + equipo2.getCiudad());
        System.out.println("Puntos: " + equipo2.getPuntos());
        System.out.println("Goles a favor: " + equipo2.getGolesFavor());
        System.out.println("Goles en contra: " + equipo2.getGolesContra());
        System.out.println();

        // Jugar un partido usando la versión i del método
        equipo1.jugarPartido(true); // Ganó, se suman 3 puntos
        equipo2.jugarPartido(false); // Empató, se suman 1 punto

        // Imprimir información actualizada después del partido
        System.out.println("Después del primer partido:");
        System.out.println("Equipo 1 - Puntos: " + equipo1.getPuntos());
        System.out.println("Equipo 2 - Puntos: " + equipo2.getPuntos());
        System.out.println();

        // Jugar otro partido usando la versión ii del método
        equipo1.jugarPartido(false, 2); // Empató y anotó 2 goles

        // Imprimir información actualizada después del segundo partido
        System.out.println("Después del segundo partido:");
        System.out.println("Equipo 1 - Puntos: " + equipo1.getPuntos());
        System.out.println("Equipo 1 - Goles a favor: " + equipo1.getGolesFavor());
        System.out.println();

        // Jugar otro partido usando la versión iii del método
        equipo2.jugarPartido(true, 3, 1); // Ganó, anotó 3 goles y recibió 1 gol

        // Imprimir información actualizada después del tercer partido
        System.out.println("Después del tercer partido:");
        System.out.println("Equipo 2 - Puntos: " + equipo2.getPuntos());
        System.out.println("Equipo 2 - Goles a favor: " + equipo2.getGolesFavor());
        System.out.println("Equipo 2 - Goles en contra: " + equipo2.getGolesContra());
    }
}
