package locadora.Classificacoes;

import locadora.Classificacao;
import locadora.Enum.CustoEnum;

public class Infantil extends Classificacao{

    public Infantil() {
        this.custo = CustoEnum.INFANTIL.getValor();
    }

    @Override
    protected double calculaValorPorDias(int diasAlugado) {
        double valorCorrente = getCusto();

        if(diasAlugado > 3) {
            valorCorrente += (diasAlugado - 3) * 1.5;
        }

        return valorCorrente;
    }

    @Override
    protected int getPafValue(int diasAlugado) {
		return 1;
    }
    
    
}
