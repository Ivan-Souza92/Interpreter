import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaizQuadradaTest {

    @Test
    void raizQuadrada(){

        Expressao RQ = new Numero(16);

        RaizQuadrada R = new RaizQuadrada(RQ);

        assertEquals(4, R.interpretar());
    }

}