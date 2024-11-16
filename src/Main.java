public class Main {
    public static void main(String[] args) {
        Portero portero = new Portero("Carlos", 28, "FC Azul", 50, 20);
        Defensa defensa = new Defensa("Miguel", 25, "FC Rojo", 30);
        Delantero delantero = new Delantero("Luis", 23, "FC Verde");

        portero.mostrarInfo();
        defensa.mostrarInfo();
        delantero.mostrarInfo();

    }
}
