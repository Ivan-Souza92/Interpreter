public class ConverterGrausCParaF implements Expressao{

    private Expressao c;
    public ConverterGrausCParaF(Expressao c) {
        this.c = c;
    }

    @Override
    public float interpretar() {
        return (9/5)* this.c.interpretar() + 32;
    }
}
