public class Combate {
    private GeneradorAleatorio generador;

    public Combate(GeneradorAleatorio generador) {
        this.generador = generador;
    }

    public int atacar(Jugador jugador, Enemigo enemigo) {
        int damage;

        if (enemigo.estaDerrotado()) {
            damage = 0;
        } else {
            int resultado = generador.generar();

            if (resultado <= 20) {
                damage = 0;
            } else {
                int damageBase = jugador.getArma().getDamage();
                int calculo;

                if (resultado <= 80) {
                    calculo = damageBase - enemigo.getDefensa();
                } else {
                    calculo = damageBase * 2 - enemigo.getDefensa();
                }

                damage = (int) Math.max(0, calculo);
            }

            enemigo.recibirDamage(damage);
        }

        return damage;
    }
}
