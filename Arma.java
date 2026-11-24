public class Arma {
    private final String nombre;
    private final int damage;

    public Arma(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = Math.max(0, damage);
    }

    public int getDamage() {
        return damage;
    }

    public String getNombre() {
        return nombre;
    }
}

