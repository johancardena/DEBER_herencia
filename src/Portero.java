public class Portero extends Jugador {
     int atajadas;
     int golesRecibidos;

    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atajadas: " + atajadas + ", Goles Recibidos: " + golesRecibidos);
        System.out.println("Posición: Portero");
        System.out.println("---------------------------------------------------------------");

    }
}