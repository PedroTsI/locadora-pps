package locadora.Classificacoes;

import locadora.Classificacao;
import locadora.Enum.CustoEnum;

public class Online extends Classificacao{

    public Online() {
       this.custo = CustoEnum.ONLINE.getValor();
    }

    @Override
    protected double calculaValorPorDias(int diasAlugado) {
        double valorCorrente = this.getCusto();

        if(diasAlugado > 3) {
            valorCorrente += (diasAlugado - 3) * 3.0;
        }
        return valorCorrente;
    }

    @Override
    protected int getPafValue(int diasAlugado) {
		return 1;
    }
    
}
