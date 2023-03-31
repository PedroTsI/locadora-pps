package locadora.Classificacoes;

import locadora.Classificacao;
import locadora.Enum.CustoEnum;

public class Lancamento extends Classificacao{

    public Lancamento() {
        this.custo = CustoEnum.LANCAMENTO.getValor();
    }

    @Override
    protected double calculaValorPorDias(int diasAlugado) {
        double valorCorrente = this.getCusto() * diasAlugado;
        return valorCorrente;
    }

    @Override
    protected int getPafValue(int diasAlugado) {
		return 2;
    }
    
}
