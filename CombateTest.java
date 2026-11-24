import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CombateTest {
    @Test
    public void ataqueFallido() {
        GeneradorAleatorio generador = mock(GeneradorAleatorio.class);
        Combate combate = new Combate(generador);
        Enemigo enemigo = mock(Enemigo.class);
        Jugador jugador = new Jugador("Ayla", 100, new Arma("Espada", 30));

        when(generador.generar()).thenReturn(10);
        when(enemigo.estaDerrotado()).thenReturn(false);

        int damage = combate.atacar(jugador, enemigo);

        assertEquals(0, damage);
        verify(enemigo).recibirDamage(0);
    }

    @Test
    public void ataqueNormal() {
        GeneradorAleatorio generador = mock(GeneradorAleatorio.class);
        Combate combate = new Combate(generador);
        Enemigo enemigo = mock(Enemigo.class);
        Jugador jugador = new Jugador("Ayla", 100, new Arma("Espada", 30));

        when(generador.generar()).thenReturn(50);
        when(enemigo.estaDerrotado()).thenReturn(false);
        when(enemigo.getDefensa()).thenReturn(10);

        int damage = combate.atacar(jugador, enemigo);

        assertEquals(20, damage);
        verify(enemigo).recibirDamage(20);
    }

    @Test
    public void golpeCritico() {
        GeneradorAleatorio generador = mock(GeneradorAleatorio.class);
        Combate combate = new Combate(generador);
        Enemigo enemigo = mock(Enemigo.class);
        Jugador jugador = new Jugador("Ayla", 100, new Arma("Espada", 30));

        when(generador.generar()).thenReturn(90);
        when(enemigo.estaDerrotado()).thenReturn(false);
        when(enemigo.getDefensa()).thenReturn(10);

        int damage = combate.atacar(jugador, enemigo);

        assertEquals(50, damage);
        verify(enemigo).recibirDamage(50);
    }

    @Test
    public void defensaSuperiorAlAtaque() {
        GeneradorAleatorio generador = mock(GeneradorAleatorio.class);
        Combate combate = new Combate(generador);
        Enemigo enemigo = mock(Enemigo.class);
        Jugador jugador = new Jugador("Ayla", 100, new Arma("Espada", 30));

        when(generador.generar()).thenReturn(50);
        when(enemigo.estaDerrotado()).thenReturn(false);
        when(enemigo.getDefensa()).thenReturn(40);

        int damage = combate.atacar(jugador, enemigo);

        assertEquals(0, damage);
        verify(enemigo).recibirDamage(0);
    }
}
