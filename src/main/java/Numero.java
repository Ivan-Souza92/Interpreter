
public class Numero implements Expressao {

    private float numero;

    public Numero(float numero) {
        this.numero = numero;
    }

    public float interpretar() {
        return numero;
    }

    public double getNumero() {
        return this.numero;
    }

}