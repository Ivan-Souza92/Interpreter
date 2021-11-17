import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterGrausFParaCTest {
    @Test
    void ConverterFparaC(){
        Expressao GC = new ConverterGrausFParaC(new Numero(109));
        ConverterGrausFParaC temperaturaC = new ConverterGrausFParaC(GC);

        assertEquals(45.0, temperaturaC.interpretar());
    }

}