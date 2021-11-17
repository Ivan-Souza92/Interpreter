import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterGrausCParaFTest {

    @Test
    void CalcularCparaF(){
        Expressao GF = new ConverterGrausCParaF(new Numero(45));
        ConverterGrausCParaF temperaturaF = new ConverterGrausCParaF(GF);

        assertEquals(109.0, temperaturaF.interpretar());
    }

}