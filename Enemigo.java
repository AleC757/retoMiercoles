
public class Enemigo {
    private String nombre;
    private int vida;
    private int defensa;

    public Enemigo(String nombre, int vida, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
    }

    public void recibirDanio(int danio) {
        vida -= danio;

        if (vida < 0) {
            vida = 0;
        }
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaDerrotado() {
        return vida <= 0;
    }
}
