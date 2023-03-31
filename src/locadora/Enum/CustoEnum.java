package locadora.Enum;

public enum CustoEnum {
    INFANTIL(1.5),
    LANCAMENTO(3),
    ONLINE(4),
    NORMAL(2);

    private double valor;

    CustoEnum(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
