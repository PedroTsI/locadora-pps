package locadora;

public abstract class Classificacao {
    
    protected double custo;

    public Classificacao() {}

    final public double getCusto() {
        return custo;
    }

    final public void setCusto(double custo) {
        this.custo = custo;
    }

    final public double getCustoClassificacaoPorDiasAlugados(int diasAlugado) {
        return calculaValorPorDias(diasAlugado);
    }

    protected abstract double calculaValorPorDias(int diasAlugado);

    protected abstract int getPafValue(int diasAlugado);
}
