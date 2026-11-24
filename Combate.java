public class Combate {
    private GeneradorAleatorio generador;

    public Combate(GeneradorAleatorio generador) {
        this.generador = generador;
    }

    public int atacar(Jugador jugador, Enemigo enemigo) {
        int danio;
        if (enemigo.estaDerrotado()) {
            danio = 0;
        } else {
            double resultado = generador.generar();
            if (resultado < 0.1) {
                danio = 0;
            } else {
                danio = jugador.getArma().getDanio();
                if (resultado < jugador.getArma()
                        .getProbabilidadCritica() + 0.1) {
                    danio *= 2;
                }
                danio -= enemigo.getDefensa();
                if (danio < 0) {
                    danio = 0;
                }
                enemigo.recibirDanio(danio);
            }
        }
        return danio;
    }
}
