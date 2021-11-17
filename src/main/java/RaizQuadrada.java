public class RaizQuadrada implements Expressao{

    private Expressao numero ;

    public RaizQuadrada(Expressao numero) {
        this.numero = numero;
    }

    @Override
    public float interpretar() {

        return (float) Math.sqrt(numero.interpretar());
    }
}
