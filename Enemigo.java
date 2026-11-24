public class Enemigo {
    private String nombre;
    private int vida;
    private int defensa;

    public Enemigo(String nombre, int vida, int defensa) {
        this.nombre = nombre;
        this.vida = Math.max(0, vida);
        this.defensa = Math.max(0, defensa);
    }

    public void recibirDamage(int damage) {
        vida = Math.max(0, vida - Math.max(0, damage));
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
