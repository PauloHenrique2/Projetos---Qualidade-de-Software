import org.junit.Test;

import static org.junit.Assert.*;

public class TestProgressaoGeometrica {
    ProgressaoGeometrica pg = new ProgressaoGeometrica();
    @Test
    public void Teste1SomaProgressaoGeometrica() {
        double valorEsperado = 1023;
        double valorGerado = pg.somaProgressaoGeo(2, 10);
        assertEquals(valorEsperado, valorGerado, 0.01);
    }

    @Test
    public void Teste2SomaProgressaoGeometrica() {
        double valorEsperado = 30;
        double valorGerado = pg.somaProgressaoGeo(2, 5);
        assertNotEquals(valorEsperado, valorGerado, 0.01);
    }

    @Test
    public void Test3SomaProgressaoGeometrica() {
        assertTrue(pg.somaProgressaoGeo(2, 5) > 0);
    }

    @Test
    public void Test4SomaProgressaoGeometrica() {
        assertFalse(pg.somaProgressaoGeo(2, 5) < 0);
    }
}
