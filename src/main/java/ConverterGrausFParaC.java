public class ConverterGrausFParaC implements Expressao{

    private Expressao f;

    public ConverterGrausFParaC(Expressao f) {
        this.f = f;
    }

    @Override
    public float interpretar() {
        return (9/5)*this.f.interpretar() - 32;
    }
}
