
public class Arma {
    private String nombre;
    private int danio;
    private double probabilidadCritica;

    public Arma(String nombre, int danio,
            double probabilidadCritica) {
        this.nombre = nombre;
        this.danio = danio;
        this.probabilidadCritica = probabilidadCritica;
    }

    public int getDanio() {
        return danio;
    }

    public double getProbabilidadCritica() {
        return probabilidadCritica;
    }

    public String getNombre() {
        return nombre;
    }
}

