public class Jugador {
    private String nombre;
    private Arma arma;

    public Jugador(String nombre, Arma arma) {
        this.nombre = nombre;
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public String getNombre() {
        return nombre;
    }
}

