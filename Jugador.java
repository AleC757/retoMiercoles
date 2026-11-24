public class Jugador {
    private final String nombre;
    private final int vida;
    private final Arma arma;

    public Jugador(String nombre, int vida, Arma arma) {
        this.nombre = nombre;
        this.vida = Math.max(0, vida);
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public Arma getArma() {
        return arma;
    }

    public String getNombre() {
        return nombre;
    }
}

